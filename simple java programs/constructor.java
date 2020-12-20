class Circle {
    double x,y;
    double r;
    double circumference(){
     return 2*3.14159*r;
    }
    double area(){
     return (22/7)*r*r;
    }
    Circle(double a,double b, double c){
        x = a;
        y = b;
        r = c;
    }
    Circle (){
        x = 0.0;
        y = 0.0;
        r = 0.0;
    }
    Circle (Circle c){
        x = c.x;
        y = c.y;
        r = c.r;
    }
   }
   
   class constructor{
     public static void main(String args[]){
        Circle c1 = new Circle(3.0,4.0,5.0); 
        Circle c2 = new Circle(c1); 
        Circle c3 = new Circle(); 
        System.out.println("Circumference" + c1.circumference());
        System.out.println("Area" + c1.area());
        System.out.println("Circumference" + c2.circumference());
        System.out.println("Area" + c2.area());
        System.out.println("Circumference" + c3.circumference());
        System.out.println("Area" + c3.area());
     }
   }