import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class conditional_statment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Conditional Statement");

        System.out.println("if-else Statement");

        System.out.print("enter your number");
        int number=sc.nextInt();
        if(number % 2 == 0){
            System.out.println("number is even..");
        }else{
            System.out.println("number is odd..");
        }

        System.out.println("else-if Statement");
         System.out.print("enter your number");
        int no=sc.nextInt();
        if(no == 0){
            System.out.println("number is zero");
        }else if(no > 1){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }

        System.out.println("Switch Statement");
        System.out.println("enter your day");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default :
                System.out.println("enter your above chiose for a day");
        }





    }
}
