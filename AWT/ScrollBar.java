import java.awt.*;
class ScrollBar {
    public static void main (String args[]){
        Frame f = new Frame("ScrollBar Example");
        Scrollbar h=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
        h.setBounds(100,50,300,50);

        Scrollbar v=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
        v.setBounds(100,200,50,300);

        f.add(h);
        f.add(v);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}