import javax.swing.JFrame;

public class DrawChartTest{
    public static void main(String[] args){
        DrawChart chart = new DrawChart();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(chart);
        application.setSize(500, 500);
        application.setVisible(true);
    }
}