import java.awt.*;

public class ChoiceExample {
    public static void main(String[] args){
        Frame f = new Frame ("List Example");
        Choice l1=new Choice();
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