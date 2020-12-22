 import java.util.*;

public class PalindromeCheck {
   public static boolean isPalindrome(String s) {
    String s1 = givenstring(s);
    String s2 = reverse(s1);
    return s2.equals(s1);
  }

  public static String givenstring(String s) {
    StringBuilder str = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetterOrDigit(s.charAt(i))) {
        str.append(s.charAt(i));
      }
    }
    return str.toString();
  }

  public static String reverse(String s) {
    StringBuilder str = new StringBuilder(s);
    str.reverse(); 
    return str.toString();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s = input.nextLine();
    System.out.println("Ignoring nonalphanumeric characters, \nIs " + s + " a palindrome? " + isPalindrome(s));
  }
}