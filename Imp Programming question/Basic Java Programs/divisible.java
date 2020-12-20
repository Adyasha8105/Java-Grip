import java.util.Scanner;

public class divisible {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a integer: ");
      int num = sc.nextInt();
      if(num>0) {
        if ((num%5==0) && (num%6==0)) {
           System.out.printf("%d is divisible by both 5 and 6.\n",num);}
       else if ((num%5==0) || (num%6==0)){
           System.out.printf("%d is divisible by 5 or 6 but not both.\n",num);}
       else
           System.out.printf("%d is not divisible by either 5 or 6.\n",num);
       }
      else
         System.out.println("Invalid input");
   }
}