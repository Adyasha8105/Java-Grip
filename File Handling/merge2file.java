//Concaetation of two input file

import java.io.*;

public class merge2file {
    public static void main(String args[]) throws Exception{
        FileInputStream file1 = new FileInputStream ("Test.txt");
        FileInputStream file2 = new FileInputStream ("text.txt");
        SequenceInputStream file3 = new SequenceInputStream(file1,file2);
        try{
            BufferedInputStream inBuffer = new BufferedInputStream(file3);
            BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
            int ch;
            while ((ch = inBuffer.read())!= -1)
               outBuffer.write((char)ch);
            inBuffer.close();
            outBuffer.close();
            file1.close();
            file2.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}