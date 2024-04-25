package unit06;
import java.util.Scanner;

public class primes {
    
    public static boolean isPrime(int n) { //determines whether numbers are prime or not
        if(n <= 1) {
            return false;
        }
        else {
            for(int i = 2; i <= n/2; i++) { //optimized way of telling if a number is prime
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean invalid = false; boolean prime = false;
        int natural_num;
        Scanner sc = new Scanner(System.in);
        while(invalid == false) { //never invalid, loop ends whenever natural num < 1
            System.out.print("Enter a natural number: ");
            natural_num = sc.nextInt();
            if(natural_num < 1) {
                break;
            }
            else {
                prime = isPrime(natural_num);
                if(prime == true) {
                    System.out.println(natural_num + " is a prime number");
                }
                else {
                    System.out.println(natural_num + " is not a prime number");
                }
            }
        }
        sc.close();
    }

}
