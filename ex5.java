public class ex5 {

    public static void main(String[] args) {
        System.out.println("for loop for the print pattern");

        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // *****
        // * *
        // * *
        // *****

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // *
        // **
        // ***
        // ****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // ****
        // ***
        // **
        // *

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        //    *
        //   **
        //  ***
        // ****
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // 1
        // 12
        // 123
        // 1234
        // 12345

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("" + j);
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        // 12345
        // 1234
        // 123
        // 12
        // 1

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("" + j);
            }
            System.out.println();

        }

         System.out.println();
        System.out.println();

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

        int no=1;
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + no);
                no++;
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1

         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        //*      *
        //**    **
        //***  ***
        //********
        //********
        //***  ***
        //**    **
        //*      *

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(5-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
         for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(5-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

         System.out.println();
        System.out.println();

        //    ******
        //   ******
        //  ******
        // ******
        //****** 

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

         System.out.println();
        System.out.println();

        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4 
        //5 5 5 5 5

         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();

        }

         System.out.println();
        System.out.println();

        //      1
        //     212
        //    32123
        //   4321234
        //  543212345

         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(""+j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(""+j);
            }
            System.out.println();

         }

          System.out.println();
        System.out.println();

        //    *
        //   ***
        //  *****
        // *******
        // *******
        //  *****
        //   ***
        //    *


        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            // for (int j = 2; j <= i; j++) {
            //     System.out.print("*");
            // }
            System.out.println();

         }
          for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            // for (int j = 2; j <= i; j++) {
            //     System.out.print("*");
            // }
            System.out.println();

         }





    }
}