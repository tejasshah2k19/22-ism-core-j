package collectiond;

import java.util.TreeMap;

public class MapDemo {

	// O(1) --> insert delete read
	public static void main(String[] args) {
//		HashMap<Integer, String> hs = new HashMap<>();
		TreeMap<Integer, String> hs = new TreeMap<>();
		// hs.put("ram","ram");//r a m O(1+len(str));
		hs.put(0, "neel");
		hs.put(1, "saurabh");
		hs.put(200, "samarth");
		hs.put(13, "jigar");
		hs.put(13, "Jigar");
		hs.put(4, "Jigar");
		System.out.println(hs);
		System.out.println(hs.get(4));// null
		System.out.println(hs.get(3));// null
		System.out.println(hs.get(13));// jigar
	}
}
