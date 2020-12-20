import java.util.Scanner;

public class scannerprogram {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.printf("Enter two number");
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b){
        System.out.printf("max= %d",a);
        }
        else {
        System.out.printf("max= %d",b);
        }

    }
}