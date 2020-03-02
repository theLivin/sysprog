// Test application to display bull's eye
import javax.swing.JFrame;

public class DrawBullEyeTest{
    public static void main(String[] args){
        DrawBullEye panel = new DrawBullEye();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}