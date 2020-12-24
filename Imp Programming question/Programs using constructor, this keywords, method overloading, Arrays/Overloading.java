import java.io.*;
import java.util.*;
public class Overloading {
    public void getArea(int r) {
        double area= Math.PI*r*r;
        System.out.println("Area of the Circle: "+area);
    }

    public void getArea(int b, float h) {
       double area= 0.5*b*h;
        System.out.println("Area of the Right-angled Triangle: "+area);
    }

    public void getArea(int s1, int s2, int s3) {
        double s=(s1+s2+s3)/2;
        double area= Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("Area of the Triangle: "+area);
    }

    public void getArea(float a) {
       double area= a*a;
        System.out.println("Area of the Sqaure: "+area);
    }

    public void getArea(float l, int b) {
       double area= l*b;
        System.out.println("Area of the Rectangle: "+area);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Overloading a= new Overloading();

        System.out.print("Enter the Radius of the circle: ");
        int radius= s.nextInt();
        a.getArea(radius);

        System.out.print("Enter the length of the base and height of the Right-angled Triangle: ");
        int b= s.nextInt();
        float height= s.nextFloat();
        a.getArea(b, height);

         System.out.print("Enter the length of the sides of the triangle: ");
        int side1= s.nextInt();
        int side2= s.nextInt();
        int side3= s.nextInt();
        a.getArea(side1,side2,side3);

        System.out.print("Enter the side length of the Square: ");
        float side= s.nextFloat();
        a.getArea(side);


        System.out.print("Enter the size of length and base of the Rectangle: ");
        float length= s.nextFloat();
        int base= s.nextInt();
        a.getArea(length, base);
    }
}
