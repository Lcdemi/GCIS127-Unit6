package unit06;
//import java.util.Arrays;
//import java.util.Scanner;

public class Activities {
    public static void evenlyDivisible(int n) {
        if(n % 2 == 0) {
            System.out.println(n + " is even");
        } 
        else {
            if(n % 3 == 0) {
                System.out.println(n + " is divisible by 3");
            }
            else {
                if(n % 5 == 0) {
                System.out.println(n + " is divisible by 5");
                }
                else {
                    System.out.println(n + " is odd");
                }
            }
        }
    }

    public static int countWhile(int n) {
        int i = 0; int sum = 0;
        while(i < n) {
            System.out.println(i);
            sum += i;
            i++;
        }
        return sum;
    }

    public static int countFor(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }

    public static int[] squares(int n) {
        int[] square_nums = new int[n];
        for(int i = 0; i < square_nums.length; i++) {
            square_nums[i] = i * i;
        }
        return square_nums;
    }

    public static void main(String[] args) {
        /*
        double pi = 3.14159; //64 bits of memory
        float a = 12.34f; //32 bits of memory, f forces to be a float
        int num = 5;
        long num2 = 12345l; //64 bits of memory, l forces to be a long
        byte one = 1;
        char b = 65;
        char b2 = 'b';
        boolean truth = true;

        System.out.println(pi);
        System.out.println(a);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(one);
        System.out.println(b);
        System.out.println(b2);
        System.out.println(truth);

        String s = "abc" + 123 + 12.34 + 'c' + false + "def";
        System.out.println(s);

        evenlyDivisible(24);
        evenlyDivisible(21);
        evenlyDivisible(25);
        evenlyDivisible(23);
        
        System.out.println(countWhile(10));
        System.out.println(countFor(10));

        int[] squares = squares(10);
        System.out.println(Arrays.toString(squares));
        */


    }
}
