import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawChart extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawRect(0, height, 50, -100);
        g.drawRect(100, height, 50, -300);
        g.drawRect(200, height, 50, -200);
        g.drawRect(300, height, 50, -50);
        g.drawRect(400, height, 50, -height);
    }
}