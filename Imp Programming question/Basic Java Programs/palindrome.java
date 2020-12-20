import java.util.Scanner;

public class palindrome {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("\nEnter the number to be checked for palindrome: ");
      int num = sc.nextInt();
      int rem, sum=0, temp;
      temp=num;
      while(num!=0){
        rem = num%10;
        sum = (sum*10) + rem;
        num = num/10;
      }
      if(temp==sum)
         System.out.printf("%d is a palindrome number.\n",temp);
      else
         System.out.printf("%d is not a palindrome number.\n",temp);
    }
}