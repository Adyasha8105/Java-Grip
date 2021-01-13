import java.applet.Applet;
import java.awt.*;
public class OctagonTest extends Applet {
    private Octagon octagon;
    private Point p1, p2, p3, p4, p5, p6, p7, p8;
    public void init() {
        p1 = new Point(69, 25);
        p2 = new Point(131, 25);
        p3 = new Point(175, 69);
        p4 = new Point(175, 131);
        p5 = new Point(131, 175);
        p6 = new Point(69, 175);
        p7 = new Point(25, 131);
        p8 = new Point(25, 69);
        octagon = new Octagon(p1, p2, p3, p4, p5, p6, p7, p8);
        octagon = new Octagon();
        octagon.addPoint(p1);
        octagon.addPoint(p2);
        octagon.addPoint(p3);
        octagon.addPoint(p4);
        octagon.addPoint(p5);
        octagon.addPoint(p6);
        octagon.addPoint(p7);
        octagon.addPoint(p8);
    }
    public void paint(Graphics g) {
        g.setColor(Color.pink);
        octagon.fill(g);
    }
}
class Octagon extends Polygon {
    public Octagon() {
        super();
    }
    public Octagon(int x1, int y1,
        int x2, int y2,
        int x3, int y3,
        int x4, int y4,
        int x5, int y5,
        int x6, int y6,
        int x7, int y7,
        int x8, int y8) {
        super();
        this.addPoint(x1, y1);
        this.addPoint(x2, y2);
        this.addPoint(x3, y3);
        this.addPoint(x4, y4);
        this.addPoint(x5, y5);
        this.addPoint(x6, y6);
        this.addPoint(x7, y7);
        this.addPoint(x8, y8);

    }
    public Octagon(Point p1,
        Point p2,
        Point p3,
        Point p4,
        Point p5,
        Point p6,
        Point p7,
        Point p8) {

        this(p1.x, p1.y, p2.x, p2.y, p3.x, p3.y, p4.x, p4.y,
            p5.x, p5.y, p6.x, p6.y, p7.x, p7.y, p8.x, p8.y);

    }
    public void draw(Graphics g) {
        g.drawPolygon(this);
    }
    public void fill(Graphics g) {
        g.fillPolygon(this);
    }
    public void addPoint(Point p) {
        super.addPoint(p.x, p.y);
    }
}