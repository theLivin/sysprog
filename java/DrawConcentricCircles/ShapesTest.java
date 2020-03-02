import javax.swing.JFrame;

public class ShapesTest{
    public static void main(String[] args){
        JFrame application = new JFrame();
        Shapes panel = new Shapes();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}