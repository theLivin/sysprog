// Drawing a cascade of shapes based on the user's choice
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
    private int choice;//user's choice of which shape to draw

    // Constructor sets the user's choice
    public Shapes(int userChoice){
        choice = userChoice;
    }

    // Draws a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i< 10; i++){
            // Pick the shape based on the user's choice
            switch(choice){
                case 1: // Draw rectangles
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: // Draw ovals
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
            }
        }
    }// End paintComponent()

}// End class Shapes
