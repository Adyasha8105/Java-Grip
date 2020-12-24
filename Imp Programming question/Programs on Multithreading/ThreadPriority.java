class ThreadPriority extends Thread {
	public void run() {
		int count =0;
		for(int i=0;i<1000;i++) {
			count++;
		}
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		ThreadPriority obj=new ThreadPriority();
		Thread t1=new Thread(obj,"one");
		Thread t2=new Thread(obj,"Two");
		t1.setPriority(3);
		t2.setPriority(5);
		t1.start();
		t2.start();
	}
}
