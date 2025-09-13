import java.util.Scanner;

public class stringbuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //string change
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

        //char at indexof
        System.out.println(sb.charAt(0));

        //set char of index

        sb.setCharAt(0, 's');
        System.out.println(sb);

        //inset of a char

        sb.insert(0, "j");
        System.out.println(sb);

        //delete the string

        sb.delete(0, 1);
        System.out.println(sb);

        //append a element

        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);
        System.out.println(sb.length());

        

        //strings in java are immutable
    }
}