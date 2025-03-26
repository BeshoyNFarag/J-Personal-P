/*
* Task 2: Concatenating Strings
Description:
Write a method concatStrings that takes a variable number of string arguments
* and concatenates them into a single string.*/


public class Practice2 {
    public String conc(String ... strings){
        String conc = "";
        for(String string : strings){
            conc += string;
        }
        return conc;
    }
    public static void main(String [] args){
        Practice2 practice = new Practice2();
        System.out.println(practice.conc("messi"," ", "Ronaldo", " " , "Neymar"));

    }
}
