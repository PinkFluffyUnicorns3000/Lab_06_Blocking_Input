import java.util.Scanner;
public class Metric_Converter {
    public static void main(String[] args){
        //Declare variables
        double meters =0;
        double miles = 0;
        double feet = 0;
        double inches = 0;

        String trash;

        boolean done = false;

        // Loop input
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("What is the measurement in meters? ");
            if(in.hasNextDouble()){
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input!");
            }
        }while(!done);

        //Computing
        miles = meters / 1609.344;
        feet = meters * 3.2808399;
        inches = meters *  39.3700787;

        // Printing results
        System.out.println("Your measurement was " + meters + " meters long");
        System.out.println("That is: ");
        System.out.printf("Miles : %16.6f" ,miles);   //Lines ip the numbers to be aligned on the right
        System.out.println(" ");                   //creates a new line for printf
        System.out.printf("Feet : %17.6f" ,feet);
        System.out.println(" ");
        System.out.printf("Inches : %15.6f" ,inches);
    }
}
