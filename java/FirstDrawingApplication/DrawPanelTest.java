// Creating JFrame to display DrawPanel
import javax.swing.JFrame;

public class DrawPanelTest{
    public static void main(String[] args){
        // create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();

        // create a new frame to hold the panel
        JFrame application = new JFrame();

        // set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add panel to frame
        application.add(panel);

        // set the size of the frame
        application.setSize(250, 250);

        // make the frame visible
        application.setVisible(true);
    }
    
}// end class DrawPanelTest

