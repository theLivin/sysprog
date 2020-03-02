// Obtaining user input and creating JFrame to display shapes
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest{
    public static void main(String[] args){
        // Obtain user's choice
        String userChoice = JOptionPane.showInputDialog("Enter 1 to draw rectangles\nEnter 2 to draw ovals");
        // Convert string to int
        int choice = Integer.parseInt(userChoice);
        // Create the panel with user's input
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}// end class ShapeTest