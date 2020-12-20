class Triangle {
    double side1, side2, side3;
    
    double getArea(){
     double p = (side1+side2+side3)/2;
     double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
     return area;
    }

    double getPerimeter(){
        return side1+side2+side3;
    }

    Triangle(double newSide1,double newSide2, double newSide3){
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }

    Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
   }
   
  public class Trianglecalc{
     public static void main(String args[]){
        Triangle T1 = new Triangle(4,5,6);
        System.out.println("\nPerimeter of triangle1: " + T1.getPerimeter());
        System.out.println("Area of triangle1: " + T1.getArea());
        Triangle T2 = new Triangle(1.5,2.5,3.5);
        System.out.println("\nPerimeter of triangle2: " + T2.getPerimeter());
        System.out.println("Area of triangle2: " + T2.getArea());
     }
   }