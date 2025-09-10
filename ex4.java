import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("loop exercise");

        //wap to print table for user input
        System.out.print("enter a table number");
        int no = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no+"*"+i+"="+(no*i));
        }

        //wap to print factorial number
        System.out.print("enter your factorial number:");
        int fno = sc.nextInt();
        int result = 1;
        for(int i=2; i<=fno; i++){
            result=result*i;//1*2*3*4*5   
        }
         System.out.println(result);//5*4*3*2*1

        //print the sum of first n natural number
         System.out.println("enter a natural number");
         int n = sc.nextInt();
         int sum=0;
         for (int i = 1; i <=n; i++) {
            sum=sum+i;
         }
         System.out.println(sum);

    }
}