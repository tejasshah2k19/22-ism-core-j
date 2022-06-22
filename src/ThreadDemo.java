import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		Copy c = new Copy();
//		c.start();
//
		Print p = new Print();
//		p.start();

		System.out.println(Runtime.getRuntime().availableProcessors());

		ExecutorService ex = Executors.newCachedThreadPool();// 8 -> 60second 2

		ex.execute(c);
		ex.execute(p);
		ex.shutdown();
	}
}

//2 ways to create thread 
//1 extends Thread 
//2 implements Runnable

//public void run()

//100 second
class Copy extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("copy => " + i);
			// 1 second
			// 100second
		}
	}
}

//100 second 
class Print extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Print => " + i);
		}
	}
}
