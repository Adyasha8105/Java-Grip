import java.util.*;
public  class  Circle5 extends Point {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point p1=new Point();
		Point p2=new Point();
		System.out.println("Enter coordinates of first point:");
        p1.x=sc.nextDouble();
		p1.y=sc.nextDouble();
		System.out.println("Enter coordinates of second point:");
        p2.x=sc.nextDouble();
		p2.y=sc.nextDouble();
		Circle5 c=new Circle5();
		double result=c.distance(p1,p2);
        System.out.println("Distance between two points is:"+" "+result);
	}
}
class Point {
	double x,y;
	double distance(Point p1,Point p2){
        return Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x)) + ((p1.y-p2.y)*(p1.y-p2.y)));
	}
}
