import java.util.Arrays;
import java.util.List;

public class J8 {

	public static void main(String[] args) {
		Sum s = new Sum();
		Thread t = new Thread(s);
		t.start();

		// lambda

		Runnable r = () -> {
			System.out.println("this is thread");
		};
		Thread tr = new Thread(r);
		tr.start();

		new Thread(() -> {
			System.out.println("thread");
		}).start();

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.forEach(y -> System.out.println(y));

	}
}

class Sum implements Runnable {
	public void run() {
		System.out.println("thread.....");

	}
}
