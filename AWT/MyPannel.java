import java.awt.*;

public class MyPannel {
    public static void main (String args[]) {
        Frame frame = new Frame ("Frame in Pannel");
        Panel panel = new Panel( );
        frame.resize (500,500);
        frame.setBackground (Color.yellow);
        frame.setLayout(null);
        panel.resize (150,150);
        panel.setBackground (Color.pink);
        frame.add(panel);
        frame.show();
   }
}