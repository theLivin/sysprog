// Test application that displays a smiley face
import javax.swing.JFrame;

public class DrawSmileyTest{
    public static void main(String[] args){
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(230, 250);
        application.add(panel);
        application.setVisible(true);
    }
}