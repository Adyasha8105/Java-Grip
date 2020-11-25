class ThreadA extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
            if(i==1) yield();
           System.out.println("From Thread A with i "+ -1*i);
        }
      System.out.println("Exit thread A...");
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int j=1;j<=5;j++) {
           System.out.println("From Thread B with j +"+ 2*j);
           if(j==2) stop();
        }
      System.out.println("Exit thread B...");
    }
}

class ThreadC extends Thread{
    public void run(){
        for(int k=1;k<=5;k++) {
           System.out.println("From Thread C with k +"+ (2*k-1));
           if(k==3){
               try{
                   sleep(1000);
               } catch(Exception e){}
           }
        }
      System.out.println("Exit thread C...");
    }
}

public class DemoMethods {
    public static void main(String args[]){
       ThreadA a = new ThreadA();
       ThreadB b = new ThreadB();
       ThreadC c = new ThreadC();
       a.start();
       b.start();
       c.start();
       System.out.println("End of Excuetion");
    }
}