import java.util.Scanner;
public class Rectangle_Info {
    public static void main(String[] args) {
        // Declare variables
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        String trash = "";

        boolean done = false;
        // Looped input
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("What is the length of the rectangle? ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input! ");
            }
        } while (!done);
        do {
            done = false;
            Scanner in = new Scanner(System.in);
            System.out.print("What is the width of your rectangle? ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input!");
            }
        } while(!done);
        //Computing
        area = length * width;
        perimeter = (2 * length) + (2 * width);
        diagonal = Math.sqrt((length * length) + (width * width));

        //Printing results

        System.out.println("The dimensions of your rectangle are " + length + " by " + width + ".");
        System.out.println("The area of your figure is " + area);
        System.out.println("The perimeter of your figure is " + perimeter);
        System.out.println("The diagonal of your figure is " + diagonal);
    }
}
