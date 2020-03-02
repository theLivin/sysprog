import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int x = getWidth()/2;
        int y = getHeight()/2;

        int width = 20;
        int height = 20;
        
        for(int i=1; i< 16; i++){
            g.drawOval(x-(i*width)/2, y-(i*height)/2, width*i, height*i);
        }
    }
}