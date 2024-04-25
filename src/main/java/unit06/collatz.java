package unit06;

import java.util.Scanner;

public class collatz {
    public static String sequence(int n) { //determines the collatz sequence for a number
        String collatz_string = n + " ";
        if(n < 1) {
            return "";
        }
        while(n > 1) {
            if(n % 2 == 0) {
                n = n / 2;
            }
            else if(n % 2 == 1) {
                n = 3 * n + 1;
            }
            //System.out.println(collatz_string); test code
            collatz_string += (n + " ");
        }
        return collatz_string;
    }

    public static void main(String[] args) {
        boolean invalid = false;
        int natural_num;
        Scanner sc = new Scanner(System.in);
        while(invalid == false) { //never invalid, loop ends whenever natural num < 1
            System.out.print("Enter a natural number: ");
            natural_num = sc.nextInt();
            if(natural_num < 1) {
                break;
            }
            else {
                System.out.println(sequence(natural_num));
            }
        }
        sc.close();
    }
}
