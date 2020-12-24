import java.util.*;
class shape {
	double length,breadth;
	shape(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	shape(double length) {
		this.length=length;
		breadth=length;
	}
	double calculate() {
		return 0.0;
	}
}
public class Test1 extends shape {
	double h;
    Test1(double h,double l) {
       super(l);
	   this.h=h;
	}
	Test1(double l,double b,double h) {
       super(l,b);
	   this.h=h;
	}
	double calculate() {
	   double volume=length*breadth*h;
	   return volume;
	}
	public static void main(String args[]) {
	    Test1 myshape1 = new Test1(10,20);
	    Test1 myshape2 = new Test1(10,20,30);
	    double volume1=myshape1.calculate();
	    double volume2=myshape2.calculate();
		System.out.println("The area of firt shape:"+volume1);
		System.out.println("The area of second shape:"+volume2);
	}
}
