// Encapsulation: Defining a class with method

class Point {
    int x,y;
    void setPoint(int a, int b){
     x = a ;
     y = b;
    }
   }
   
   class Encapsulation_2{
     public static void main(String args[]){
        Point p = new Point();
        p.setPoint(15,20);
        System.out.println("x" + p.x);
        System.out.println("y" + p.y);
     }
   }