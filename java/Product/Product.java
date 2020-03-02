// Import Scanner Class from java.util package
import java.util.Scanner;

public class Product{
    public static void main(String[] args){
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        int num1, num2, num3, pdt;

        // Get first integer
        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        // Get second integer
        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        // Get third integer
        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        // Find product of the three integers
        pdt = num1 * num2 * num3;

        // Print product to command line
        System.out.printf("%n%d x %d x %d = %d%n",num1, num2, num3, pdt);

    }
}