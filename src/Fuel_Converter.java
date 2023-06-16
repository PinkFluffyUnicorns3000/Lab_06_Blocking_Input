import java.util.Scanner;
public class Fuel_Converter {
    public static void main(String[] args){
        //Declare Variables
        double gallonsOfGas = 0;
        double milesPerGallon = 0;
        double priceOfGas = 0;
        double distance = 0;
        double price100Miles = 0;
        boolean done = false;

        String trash = "";

        // Looping inputs
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("What is the number of gallons your vehicle holds? " );
            if (in.hasNextDouble()){
                gallonsOfGas = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input! ");
                System.out.println(" ");// clears line for readability
            }
        } while(!done || gallonsOfGas < 0); // So gallons of gas cant be negative
        do
        {
            done = false;
            Scanner in = new Scanner(System.in);
            System.out.print("What is the number of miles your vehicle gets per 1 gallon? " );
            if (in.hasNextDouble()){
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input! ");
                System.out.println(" "); // clears line for readability
            }
        } while(!done || milesPerGallon < 0); // So miles per gallon cant be negative
        do
        {
            done = false;
            Scanner in = new Scanner(System.in);
            System.out.print("What is the price of gas per Gallon? " );
            if (in.hasNextDouble()){
                priceOfGas = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input! ");
                System.out.println(" ");// clears line for readability
            }
        } while(!done || priceOfGas < 0); // So price of gas cant be negative


        // Computing

        price100Miles = priceOfGas * 100.0;
        distance = gallonsOfGas * milesPerGallon;

        // Printing
        System.out.println("Your gas costs " + price100Miles + " dollars for 100 miles.");
        System.out.println("With a full tank you vehicle can go " + distance + " miles.");
    }
}
