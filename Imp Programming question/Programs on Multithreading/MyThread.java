class MyThread extends Thread {
	String str;
	MyThread(String str) {
      this.str=str;
	}
	public void run() {
		if(str.equals("printA")) {
			for(int i=1;i<=100;i++) {
				System.out.println("a");
			}
		}
		else if(str.equals("printB")) {
           for(int i=1;i<=100;i++) {
				System.out.println("b");
			}
		}
		else
		{
			for(int i=1;i<=100;i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
       MyThread obj1=new MyThread("printA");
	   MyThread obj2=new MyThread("printB");
	   MyThread obj3=new MyThread("print100");
	   obj1.start();
	   obj2.start();
	   obj3.start();
	}
}
