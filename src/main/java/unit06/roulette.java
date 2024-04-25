package unit06;

//import java.util.Arrays; for testing purposes
import java.util.Random;
import java.util.Scanner;

public class roulette {
    
    public static int spin() { //randomly picks a location
        Random RNG = new Random();
        int rand_location = RNG.nextInt(37);
        return rand_location;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bets ($ #/R/B, $ #/R/B, ...): "); //enter bets
        String bets = sc.nextLine();

        String[] betsArray = bets.split(", "); //splits the string
        //System.out.println(Arrays.toString(betsArray)); test code
        bet[] betObjects = new bet[betsArray.length];
        for(int i = 0; i < betsArray.length; i++) {
            String[] components = betsArray[i].split(" ");
            System.out.println(String.valueOf(components[1]));
            if(String.valueOf(components[1]).equals("R") || String.valueOf(components[1]).equals("B") || String.valueOf(components[1]).equals("G")) {
                betObjects[i] = new bet(Integer.valueOf(components[0]), Color.valueOf(components[1]));
            }
            else {
                betObjects[i] = new bet(Integer.valueOf(components[0]), Integer.valueOf(components[1]));
            }
        }

        System.out.println("The Wheel Spins..."); //spins the roulette wheel
        int rand_location = spin();

        Color rand_color; //determines the color of the random spot
        if(rand_location == 0) {
            rand_color = Color.G;
        }
        else if(rand_location % 2 == 0 && rand_location != 0) {
            rand_color = Color.B;
        }
        else {
            rand_color = Color.G;
        }
        System.out.println("It lands on " + rand_location + " " + rand_color);

        boolean winner = false; int totalWinnings = 0; //calculates total winnings
        for(int i = 0; i < betObjects.length; i++) {
            if(betObjects[i].getBetIndex() == rand_location) {
                totalWinnings += betObjects[i].getBetAmount() * 36;
                winner = true;
            }
            if(betObjects[i].getColor() == rand_color) {
                totalWinnings += betObjects[i].getBetAmount() * 2;
                winner = true;
            }
        }

        if(winner != true) { //payout function
            System.out.println("You won $0!");
        }
        else if(winner) {
            System.out.println("You won $" + totalWinnings + "!");
        }

        sc.close(); //closes scanner
    }
}
