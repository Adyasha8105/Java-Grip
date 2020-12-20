public class recursivefactorial{
    int n;
    int factorial(int n) {
        if (n==0)
         return(1);
         else
          return(n*factorial(n-1));
    }

    public static void main(String args[]){
        recursivefactorial x = new recursivefactorial();
        x.n= Integer.parseInt(args[0]);
        System.out.println("Factorial of "+ x.n +": "+ x.factorial(x.n));


    }
}