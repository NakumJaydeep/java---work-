import java.util.*;
public class array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 56;
        marks[1] = 57;
        marks[2] = 58;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.print("enter array size");
        int size = sc.nextInt();
        int [] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter the marks");
            numbers[i] = sc.nextInt();
        }

         for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Take an array of numbers as input and check if it is an array same x number

         System.out.print("enter array size");
        int size2 = sc.nextInt();
        int [] numbers2 = new int[size2];

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("enter the marks");
            numbers2[i] = sc.nextInt();
        }

        System.out.print("enter x number");
        int x = sc.nextInt();

         for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
           if(numbers2[i] == x){

            System.out.print("array found here");
           }
        }

       // Take an array of numbers as input and check if it is an array sorted in ascending order.


      int size3 = sc.nextInt();
      int numbers3[] = new int[size3];
      //input
      for(int i=0; i<size3; i++) {
          numbers3[i] = sc.nextInt();
      }


      boolean isAscending = true;
     
       for(int i=0; i<numbers3.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers3[i] > numbers3[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }

       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
    }
}
