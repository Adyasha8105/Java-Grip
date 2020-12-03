// import java.io.FileOutputStream;

// public class outputstream {
//     public static void main(String args[]){
//         try{
//             FileOutputStream fout = new FileOutputStream("Test.txt");
//             fout.write(65);
//             fout.close();
//             System.out.println("File writing is over...");

//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

import java.io.*;

public class outputstream {
    public static void main(String args[]){
        byte cities[]={'D','E','L','H','I'};
        FileOutputStream fout = null;
        try{
            fout = new FileOutputStream("Test.txt");
            fout.write(cities);
            fout.close();
            System.out.println("File writing is over...");

        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}