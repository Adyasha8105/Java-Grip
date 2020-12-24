class PrimeCheck implements Runnable {
	int no;
    PrimeCheck(int no) {
		this.no=no;
	}
	public void run() {
		System.out.println("-----Prime Check Using Implementing Runnable Interface-----");
		int count=0;
        for(int i=2;i<=no/2;i++) {
			if(no%2==0) {
				count++;
			}
		}
		if(count==0) {
		  System.out.println("Prime Number");
		}
		else {
          System.out.println("Not Prime");
		}
	}
}
class Prime extends Thread {
	int number;
    Prime(int number){
		this.number=number;
	}
	public void run() {
        System.out.println("-----Prime Check Using Extending Thread class-----");
		int count=0;
        for(int i=2;i<=number/2;i++) {
			if(number%2==0) {
				count++;
			}
		}
		if(count==0) {
		  System.out.println("Prime Number");
		}
		else {
          System.out.println("Not Prime");
		}
	}
}
class ThreadPrimeCheck {
	public static void main(String args[]) {
       PrimeCheck obj=new PrimeCheck(4);
	   Thread t1=new Thread(obj);
	   Prime obj1=new Prime(4);
	   t1.start();
	   obj1.start();
	}
}
