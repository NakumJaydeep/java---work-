import java.util.*;
public class ex6 {
    
    //two number is sum
   public static int printSum(int a ,int b){
       int sum = a+b;
        return sum;
    }

     //find the factorial of a number
     public static void factorialNum(int n){
        int factorial = 1;
        if(n<1){
            System.out.println("nagative velue");
            System.out.println("please enter the positive value");
        }
        else{
              for (int i = n; i >= 1; i--) {
                  factorial = factorial*i; 
                }
                System.out.println("Factorial is :"+factorial);
            }
     }

    //  Make a function to check if a number is prime or not.

    public static void primeNum(int no){
        if((no*no)%2 == 0){
            System.out.println("number is not prime");
        }else{
            System.out.println("number is prime");
        }
    }

    //Make a function to print the table of a given number n
    public static void tablePrint(int table){
            for (int i = 1; i <= 10; i++) {
                System.out.println(table+" * "+i+" = "+(table*i));
            }
    }

    //print all even number till n
    public static void printEven(int num){
            for (int i = 0; i <= num; i++) {
                if(i%2 == 0){
                    System.out.print(i+" ");
                }
            }       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = sc.nextInt();
        System.out.print("enter b number :");
        int b = sc.nextInt();
        System.out.println("sum is :"+printSum(a,b));
        System.out.print("enter factorial number :");
        int n = sc.nextInt();
        factorialNum(n);
        System.out.print("enter prime number :");
        int no = sc.nextInt();
        primeNum(no);
        System.out.print("enter table number :");
        int table = sc.nextInt();
        tablePrint(table);
         System.out.print("enter number :");
         int num = sc.nextInt();
         printEven(num);

        


    }
}
