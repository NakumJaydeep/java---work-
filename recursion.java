public class recursion {
    // print number 0 to 5
    public static void printNum(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printNum(n - 1);
        }
    }

    // print number 1 to 5
    public static void printNum2(int num2) {
        if (num2 == 6) {
            return;
        } else {
            System.out.println(num2);
            printNum2(num2 + 1);
        }
    }

    // factorial number print
    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            int factorial = factorial(num - 1);
            int fact = factorial * num;
            return fact;
        }
    }

    // febonacci series print
    public static void febonacci(int a,int b,int number) {
        if (number == 0) {
            return;
        }
        else{
            int print = a + b;
            System.out.println(print);
            febonacci(b,print,number-1);  
            
        }
    }

    // Print the sum of first n natural numbers.
   public static void sumNum(int num3, int sum){
	if(num3==0){
        System.out.println(sum);
		return;
	}
	else{
	    sum += num3;
        sumNum(num3-1,sum);
	}
   }

    //Print x^n (with stack height = n)
    public static int printPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int powerNm1=printPower(x,n-1);
        int power=powerNm1*x;
        return power;
    }
    //Print x^n (with stack height = logn)
    public static int printPower2(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        //even number
        if(n % 2 == 0){
            return printPower2(x, n/2) * printPower2(x,n/2);
        }
        else{//odd number
            return printPower2(x, n/2) * printPower2(x, n/2) * x;
        }
    }



    public static void main(String[] args) {
        int n = 5;
        int num = 6;
        int num2 = 1;
        int x = 5;
        int a = 0;
        int b = 1;
        int number = 7;
        int no = 2;
        System.out.println("print number from 5 to 1");
        printNum(n);
        System.out.println("print number from 1 to 5");
        printNum2(num2);
        System.out.println("factorial of 5");
        int facto = factorial(num);
        System.out.println(facto);
        System.out.println("fibonacci series of 5");
        System.out.println(a);
        System.out.println(b);
        febonacci(a,b,number-2);    
        System.out.println("sum of first n natural number");
        sumNum(4,0);
        System.out.println("Print x^n (with stack height = n)");
        int power = printPower(x,no);
        System.out.println(power);
        System.out.println("Print x^n (with stack height = logn)");
        int power2 = printPower2(x, no);
        System.out.println(power2);

    }
}