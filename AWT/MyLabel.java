import java.awt.*;

public class MyLabel {
    public static void main(String[] args){
        Frame f = new Frame ("Label Example");
        Label l1,l2;
        l1 = new Label("First Label 1");
        l1.setBounds(50,100,100,30);
        l2 = new Label("Second Label 2");
        l2.setBounds(50,150,100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}