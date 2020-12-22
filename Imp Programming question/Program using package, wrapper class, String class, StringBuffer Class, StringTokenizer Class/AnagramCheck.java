import java.util.*;
import java.io.*;

public class AnagramCheck {
   public static boolean isAnagram(String S1, String S2) {
    int count=0;
    if(S1.length()!= S2.length()){
        return false;
    }
    String st1=S1.toLowerCase();
	String st2=S2.toLowerCase();
    char [] ch1= st1.toCharArray();
    char [] ch2= st2.toCharArray();
        for (int i=0;i<ch1.length;i++){
            for(int j=0; j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    count++;
                }
            }
        }
        if(count==ch1.length)
            return true;
        else
            return false;
}

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word1 : ");
    String S1 = input.nextLine();
    System.out.println("Enter a word2 : ");
    String S2 = input.nextLine();
    System.out.println("Are " + S1 + " and "+ S2 +" Anagrams? " + isAnagram(S1 , S2));
  }
}