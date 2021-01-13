import java.awt.*;
import java.applet.*;
public class GraphicsDemo2 extends Applet {
    Color colors[] = {
        Color.red,
        Color.blue,
        Color.green,
        Color.yellow,
        Color.cyan,
        Color.pink
    };
    int w = 150, h = 130;
    public void paint(Graphics g) {
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i]);
            g.fillRect(i * w, 10, w, h);
        }
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[i + 3]);
            g.fillRect(i * w, 10 + h, w, h);
        }
    }
}