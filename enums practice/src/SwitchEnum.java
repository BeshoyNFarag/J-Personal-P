/*
* Enum with If-Else and Switch Cases: Use an enum to categorize different
* membership levels and apply different benefits using if-else and switch-case statements.
* */
import java.util.Scanner;


enum Membership{
    VIP,
    GOLD,
    NORMAL,



}


public class SwitchEnum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your membership type; ");
        String membershipType = scanner.nextLine().toUpperCase();


        Membership firstMember = Membership.valueOf(membershipType);

        switch(firstMember){
            case VIP -> System.out.println("apply sauna");
            case GOLD -> System.out.println("Apply one free meal per day");
            case NORMAL -> System.out.println("Apply nothing");
            default -> System.out.println("No idea");

        }

        scanner.close();

    }
}
