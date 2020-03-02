import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();

        g.drawLine(width/2, 0, width, height);
        g.drawLine(width, height, 0, height/3);
        g.drawLine(0, height/3, width, height/3);
        g.drawLine(width, height/3, 0, height);
        g.drawLine(0, height, width/2, 0);

    }
}