import java.util.*;
import java.io.*;

public class CountLetters {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String ch=sc.nextLine();
        ch=ch.toLowerCase();

        for (char c='a';c<='z';c++){
            int count=0;
            for (int i=0;i<ch.length();i++) {
                if (c==ch.charAt(i)) {
                    count++;
                }
            }
          if (count!=0) {
              System.out.print(c+ " appears " +count+" times, ");
           }
        }
      System.out.print(".\n");
    }
}