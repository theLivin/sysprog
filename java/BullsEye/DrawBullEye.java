// Draw bull's eye
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawBullEye extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // Draw largest circle -- circle 1
        g.setColor(Color.BLACK);
        g.fillOval(50, 50, 350, 350);

        // Draw circle on circle 1 -- circle 2
        g.setColor(Color.DARK_GRAY);
        g.fillOval(90, 90, 270, 270);

        // Draw circle on circle 2 -- circle 3
        g.setColor(Color.GRAY);
        g.fillOval(130, 130, 190, 190);

        // Draw circle on circle 3 -- circle 4
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(170, 170, 110, 110);

        // Draw circle on circle 4 -- circle 5
        g.setColor(Color.WHITE);
        g.fillOval(200, 200, 50, 50);

    }
}