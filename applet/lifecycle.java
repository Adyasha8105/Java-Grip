import java.applet.*;
import java.awt.*;

public class lifecycle extends Applet{
   
    StringBuffer strBuffer;
    public void init(){
      strBuffer = new StringBuffer();
      addItem("Initialise");
    }

    public void start(){
      addItem("Starting the applet");
    }

    public void stop(){
      addItem("Stoping the applet");
    }

    public void destroy(){
        addItem("unloading the applet");
    }

    void addItem(String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g){
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        g.drawString(strBuffer.toString(),10,20);
    }
} 