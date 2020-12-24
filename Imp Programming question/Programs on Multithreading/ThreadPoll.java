import java.util.concurrent.*;

class ThreadPoll extends Thread {
	String value;
	ThreadPoll(String value) {
      this.value=value;
	}
	public void run() {
      if(value.equals("printA")) {
			for(int i=1;i<=100;i++) {
				System.out.println("a");
			}
		}
	  else 
		 if(value.equals("printB")) {
           for(int i=1;i<=100;i++) {
				System.out.println("b");
			}
		}
	  else {
		 for(int i=1;i<=100;i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		ThreadPoll obj[]=new ThreadPoll[3];
		String str[]=new String[3];
		str[0]="printA";
		str[1]="printB";
		str[2]="print100";
       for(int i=0;i<str.length;i++) {
           obj[i]=new ThreadPoll(str[i]);
		   es.execute(obj[i]);
		}
		es.shutdown();
	}
}
