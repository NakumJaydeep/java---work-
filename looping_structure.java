public class looping_structure {
    public static void main(String[] args) {
        System.out.println("looping structure");

        System.out.println("for loop");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);   
        }
        System.out.println();
        
        System.out.println("while loop");
        int i = 1;
        while (i<=10) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        System.out.println("do-while loop");
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j<=10);
         System.out.println();

    }
}