class Circle {
    double x,y;
    double r;
    double circumference() {
     return 2*3.14159*r;
    }
    double area() {
     return (22/7)*r*r;
    }
   }
   
 class Box {
    double width;
    double height;
    double depth;
    double area() {
     return (width*height + height*depth + width*depth) * 2;
    }
    double volume() {
     return width*height*depth;
    }
   }

   class Demonstration_2 {
     public static void main(String args[]){
        Circle c = new Circle();
        Box b = new Box();
        c.x = 3.0;
        c.y = 4.0;
        c.r = 5.0;
        b.width = 3.0;
        b.height = 4.0;
        b.depth = 5.0;
      System.out.println("Circumference Circle" + c.circumference());
      System.out.println("Area Circle" + c.area());
      System.out.println("Area of Box" + b.area());
      System.out.println("Volume of Box" + b.volume());
     }
   }