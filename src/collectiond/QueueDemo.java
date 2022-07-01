package collectiond;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(20);
		pq.add(30);
		pq.add(15);
		pq.add(150);
		pq.add(-15);
		pq.add(15);
		System.out.println(pq);

		System.out.println(pq.peek());// top of the element
		System.out.println(pq.peek());// top of the element
		System.out.println(pq.size());
		System.out.println(pq.poll());// top of the element and remove it from queue
		System.out.println(pq.size());// 5

		System.out.println("Poll All");
		while (pq.size() != 0) {
			System.out.println(pq.poll());
		}
		pq.add(2500);
		pq.remove(2500);
		pq.contains(2500);

	}
}
