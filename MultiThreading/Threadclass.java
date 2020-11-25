class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
           System.out.println("From Thread A with i "+ -1*i);
        }
      System.out.println("Existing thread A...");
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) {
           System.out.println("From Thread B with j +"+ 2*j);
        }
      System.out.println("Existing thread B...");
    }
}

class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) {
           System.out.println("From Thread C with k +"+ (2*k-1));
        }
      System.out.println("Existing thread C...");
    }
}

public class Threadclass {
    public static void main(String args[]){
       ThreadA a = new ThreadA();
       ThreadB b = new ThreadB();
       ThreadC c = new ThreadC();
       a.start();
       b.start();
       c.start();
       System.out.println("Multithreading is over");
    }
}