import java.lang.*;

class Calculator{
    double i;
    double x = Math.sqrt(i);
}

class sqrt{
    public static void main(String args[]){
        Calculator a = new Calculator();
        a.i = Integer.parseInt(args[0]);
        System.out.println("Square root of "+ a.i +"is "+ a.x);
    }
}