// Perform addition on two integers from the user
import javax.swing.JOptionPane;

public class AdditionDialog{
    public static void main(String[] args){
        // Get user inputs
        String input1 = JOptionPane.showInputDialog("Enter first integer");
        String input2 = JOptionPane.showInputDialog("Enter second integer");

        // Convert inputs to int
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Find sum
        int sum = num1 + num2;

        // Format sum as string
        String result = String.format("%d + %d = %d", num1, num2, sum);

        // Output result in GUI
        JOptionPane.showMessageDialog(null, result);
    }
}