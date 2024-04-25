package unit06;

import java.util.Scanner;

public class Hello {

    public static void helloYou() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String line = sc.nextLine();
        System.out.println("Hello, " + line + "!");

        sc.close();
    }

    public static void main(String[] args) {
        helloYou();
    }
}
