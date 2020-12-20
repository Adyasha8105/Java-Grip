import java.util.Scanner;

public class BMIdetails {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Input height in meter: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("The Body Mass Index (BMI) is " + BMI + "kg/m2");

      if((BMI)<16){
        System.out.print("\n Serious underweight ");
      }
      else if((BMI)>=16 && (BMI)<18){
        System.out.print("\n Underweight ");
      }
      else if((BMI)>=18 && (BMI)<24){
        System.out.print("\nNormal Weight ");
      }
      else if((BMI)>=24 && (BMI)<29){
        System.out.print("\nOverWeight ");
      }
      else if((BMI)>=29 && (BMI)<35){
        System.out.print("\nSeriously overweight ");
      }
      else {
        System.out.print("\nGravely overweight ");
      }
    }
}