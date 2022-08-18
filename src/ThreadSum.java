
public class ThreadSum extends Thread {
	int sum = 10;

	public void run() {
		System.out.println("i am " + currentThread().getName());
		sum = sum + 10;
	}

	public static void main(String[] args) {

		ThreadSum t = new ThreadSum();

		Thread t1 = new Thread(t);
		t1.setName("ram");
		t1.setPriority(Thread.MAX_PRIORITY);// 1 5 10
		Thread t2 = new Thread(t);
		t2.setName("sita");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

		System.out.println(t.sum);
	}
}
