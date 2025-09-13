import java.util.*;
public class bitmanipulation {
   public static void main(String args[]) {
     //Get Bit
      int n = 5; //0101
      int pos = 3;
      int bitMask = 1<<pos;


      if((bitMask & n) == 0) {
          System.out.println("bit was zero");
      } else {
          System.out.println("bit was one");
      }




//Set Bit
      int n3 = 5; //0101
      int pos3 = 1;
      int bitMask3 = 1<<pos3;


      int newNumber3 = bitMask3 | n3;
      System.out.println(newNumber3);

//Clear Bit
     int n4 = 5; //0101
     int pos4 = 2;
     int bitMask4 = 1<<pos4;
     int newBitMask4 = ~(bitMask4);
     int newNumber4 = newBitMask4 & n4;
     System.out.println(newNumber4);



//Update Bit
      System.out.println("enter update bit number for 5:");
       Scanner sc = new Scanner(System.in);
       int oper = sc.nextInt();
       // oper=1 -> set; oper=0 -> clear
      int n5 = 5;
      int pos5 = 1;
     
      int bitMask5 = 1<<pos5;
      if(oper == 1) {
          //set
          int newNumber5 = bitMask5 | n5;
          System.out.println(newNumber5);
      } else {
       //clear
       int newBitMask5 = ~(bitMask5);
       int newNumber5 = newBitMask5 & n5;
       System.out.println(newNumber5);
      }
    }


}
