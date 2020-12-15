import java.awt.*;

public class ListExample {
    public static void main(String[] args){
        Frame f = new Frame ("List Example");
        List l1=new List(5);
        l1.setBounds(50,100,100,30);
        l1.add("Item 1");
        l1.add("Item 1");
        l1.add("Item 1");
        f.add(l1);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}

