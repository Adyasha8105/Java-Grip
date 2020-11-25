class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
           System.out.println("From Thread A with i "+ i);
        }
      System.out.println("Existing thread A...");
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) {
           System.out.println("From Thread B with j +"+ j);
        }
      System.out.println("Existing thread B...");
    }
}

class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) {
           System.out.println("From Thread C with k +"+ k);
        }
      System.out.println("Existing thread C...");
    }
}

public class Priority {
    public static void main(String args[]){
       ThreadA a = new ThreadA();
       ThreadB b = new ThreadB();
       ThreadC c = new ThreadC();
       c.setPriority(Thread.MAX_PRIORITY);
       b.setPriority(a.getPriority()+1);
       a.setPriority(Thread.MIN_PRIORITY);

       a.start();
       b.start();
       c.start();
       System.out.println("End of execution");
    }
}