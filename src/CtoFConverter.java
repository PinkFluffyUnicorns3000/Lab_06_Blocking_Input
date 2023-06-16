import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        boolean isFreezing = false;
        boolean isBoiling = false;
        int tempC = 0;
        int tempF;
        final int freezing = 32; // freezing temp of water in F
        final int boiling = 212; // boiling point of water in F
        boolean done = false;
        String Trash = "";
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("What is the temperature in C? ");
            if (in.hasNextInt()) {
                done = true;
                tempC = in.nextInt();
                in.nextLine();
                System.out.println(" ");
            } else {
                Trash = in.nextLine();
                System.out.println(" ");
                System.out.println("That is not a valid input " + Trash);
                System.out.println(" ");
            }
        } while (!done);

        tempF = (tempC * 9 / 5) + 32;  // Convert F to C

        if (tempF <= freezing) {   // Checks the temperature of the water
            isFreezing = true;      // agaist the freezing and boiling points
        } else if (tempF >= boiling) {
            isBoiling = true;
        }
        System.out.printf("%20s%25s%25s", "You said the temperature is " + tempC + "C which is " + tempF + "F."
                , "is freezing: " + isFreezing, "is boiling: " + isBoiling);
        System.out.println(" ");
    }
}