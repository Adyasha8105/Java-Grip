import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the radius");
        double r = s.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Area of circle "+ area);

    }
}