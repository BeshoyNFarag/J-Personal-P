/*Task 3: Finding the Maximum Number
Description:
Write a method findMax that takes a variable number of integer arguments and returns the largest number.*/

public class Practice3 {
    public int findMax(int ... numbers){
        int max = 0;
        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] > max){
                max = numbers[i];
            }
            else if( i + 1 == numbers.length){
                if(numbers[i] > numbers[i-1] && numbers[i] >= max){
                    max = numbers[i];
                }
                else if(numbers[i] <= numbers[i-1] && numbers[i-1] >= max){
                    max = numbers[i-1];
                }
            }

            else if(numbers[i] >= numbers[i+1] && numbers[i] >= max){
                max = numbers[i];
            }
            else if (numbers[i+1] > numbers[i] && numbers[i+1] >= max){
                max = numbers[i+1];
            }



        }
        return max;
    }

    public static void main(String [] args){
        Practice3 practice3 = new Practice3();
        System.out.println(practice3.findMax(10,555,124,2324,22434,2,55,22436));



    }
}
