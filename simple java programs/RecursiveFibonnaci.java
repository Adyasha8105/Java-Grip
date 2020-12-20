public class RecursiveFibonnaci{
    int n;
    int fibonnaci(int n) {
        if (n==0)
          return(0);
        else if (n==1)
          return(1);
        else
          return(fibonnaci(n-1)+fibonnaci(n-2));
    }

    public static void main(String args[]){
        RecursiveFibonnaci x = new RecursiveFibonnaci();
        x.n= Integer.parseInt(args[0]);
        for(int i=0;i<=x.n;i++){
        System.out.println(x.fibonnaci(i));

        }
    }
}