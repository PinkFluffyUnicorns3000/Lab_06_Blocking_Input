import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args){
        // Declaring variables
        int guess = 0;
        boolean done = false;
        String trash = "";
        Random Randomizer = new Random();
        int rand = Randomizer.nextInt(1,11);
        // looping input
        do
        {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your guess? [1-10] ");
        if(in.hasNextInt()){
            guess = in.nextInt();
            in.nextLine();
            done = true;
        } else {
            trash = in.nextLine();
            System.out.println(trash + " was not a valid guess! Try again...");
        }
        }while(!done);
        // computing
        if(guess == rand){
            System.out.println("Your guess was right on the Money good job!!!");
        } else if (guess < rand){
            System.out.println(rand + " was the magic number your guess of " + guess + " was too low!");
        } else { // It's too large
            System.out.println(rand + " was the magic number your guess of " + guess + " was too high");
        }
    }
}
