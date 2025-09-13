import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = "tony";
        String lname = "stark";
        String fullname = fname + "@" + lname;
        System.out.println(fullname);

        // length print

        System.out.println(fullname.length());

        // CharAt

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
        //concate string

        System.out.println(fname.concat("st"));

        //byte array
        byte b[] = new byte[16];
        String s2 = "raj";
        b = s2.getBytes();
        System.out.println(b);

        //string replase
        System.out.println(s2.replace("r", "RA"));

        //string indexof
        System.out.println(s2.indexOf("r" , 1));


        //touppercase
        System.out.println(s2.toUpperCase());

        //char array

        String s7 = "tony";
        char c7[] = new char[10];
        c7 = s7.toCharArray();
        System.out.println(c7);

        // compare string

        String name1 = "tony";
        String name2 = "Tony";

        int s1 = name1.compareToIgnoreCase(name2);
        System.out.println(s1);

        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        if (new String("tony") == new String("tony")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // String sentence

        String sentence = "i am a tonystark";
        String name = sentence.substring(0, sentence.length());
        System.out.println(name);

        // string to number

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(str);

        // number to string

        int no = 123;
        String str3 = Integer.toString(no);
        System.out.println(str3.length());

        // Take an array of Strings input from the user & find the cumulative (combined)
        // length of all those strings

        System.out.println("array size:");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);

        // /*
        //  * Input a string from the user. Create a new string called ‘result’ in which
        //  * you will replace the letter ‘e’ in the original string with letter ‘i’.
        //  * Example :
        //  * original = “eabcdef’ ; result = “iabcdif”
        //  * Original = “xyz” ; result = “xyz”
        //  */
        
        System.out.println("enter string");
        String str5 = sc.next();
        String result = "";

        for (int i = 0; i < str5.length(); i++) {
            if (str5.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str5.charAt(i);
            }
        }

        System.out.println(result);

        /*
         * Input an email from the user. You have to create a username from the email by
         * deleting the part that comes after ‘@’. Display that username to the user.
         * Example :
         * email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
         * email = “helloWorld123@gmail.com”; username = “helloWorld123”
         */

         System.out.println("enter email");
        String email = sc.next();
        String userName = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }

        System.out.println(userName);
    }
}
