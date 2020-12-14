import java.awt.*;

public class checkbox {
    public static void main(String[] args){
        Frame f = new Frame ("CheckBox Example");
        Checkbox c1 = new Checkbox("C++");
        c1.setBounds(100,100,50,50);
        Checkbox c2 = new Checkbox("C",true);
        c2.setBounds(100,150,50,50);
        f.add(c1);
        f.add(c2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}