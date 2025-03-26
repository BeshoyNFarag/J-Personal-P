/*Task 4: Varargs with Regular Parameters
Description:
Write a method printDetails that takes a mandatory String name
and a variable number of int scores. Print the name along with the average of the scores.*/



public class Practice4 {

    public void printDetails(String name, double ... grades){
        double averageGrade = 0.00;
        for(double grade : grades){
            averageGrade += grade;
        }

        System.out.printf("%nName:%s got the grades of average: %.3f ", name, averageGrade / grades.length);
    }




    public static void main (String [] args){
        Practice4 practice4 = new Practice4();
        practice4.printDetails("John Smith", 3.5,3.54,3.6);

    }
}
