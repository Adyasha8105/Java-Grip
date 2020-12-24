import java.util.Timer;
import java.util.TimerTask;
class Timming extends TimerTask {
	public void run() {
		System.out.println("Time out");
	}
	public static void main(String[] args) {
		Timer t1=new Timer();
		Timming task=new Timming();
		t1.schedule(task,2000,5000);
	}
}
