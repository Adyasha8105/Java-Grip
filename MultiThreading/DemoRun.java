class ThreadId implements Runnable{
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
        }
        catch(Exception e){
          System.out.println("Exception is caught");
        }
    }
}

public class DemoRun {
    public static void main (String[] args){
         int n = 8;
         for(int i=0; i<8; i++){
             Thread object = new Thread( new ThreadId());
             object.start();
         }
    }
}