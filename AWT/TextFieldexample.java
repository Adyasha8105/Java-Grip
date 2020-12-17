import java.awt.*;

public class TextFieldexample {
    public static void main(String[] args){
        Frame f = new Frame ("TextField Example");
        TextField l1,l2;
        l1 = new TextField("welcome to ");
        l1.setBounds(50,100,100,30);
        l2 = new TextField("Sandesha Reception");
        l2.setBounds(50,150,100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
//limitation of area in this program
// Similarly for text area also
