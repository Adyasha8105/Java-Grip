//Example of bufferedOutputstream class for writing into a file 

import java.io.*;

public class Bufferedoutput {
    public static void main(String args[]) throws Exception{
        FileOutputStream file = new FileOutputStream ("text.txt");
        try{
            BufferedOutputStream file1 = new BufferedOutputStream(file);
            String s = "Welcome to NPTEL";
            byte b[]=s.getBytes();
            file1.write(b);
            file1.flush();
            file1.close();
            file.close();
            System.out.println("Success");
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}