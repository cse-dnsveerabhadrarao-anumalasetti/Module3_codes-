/**
 * 
 */
package check_heterogeneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * 
 */
public interface JavaApplication {
	public static void list() {
		ArrayList al = new ArrayList();
		al.add(10);al.add(12.24);al.add('j');al.add(true);al.add("hehe");al.add(null);al.add("hehe");
		System.out.println(al);
	}
	
	public static void queue() {
		PriorityQueue pq = new PriorityQueue();
//		pq.add(10);pq.add(12.24);pq.add('j');pq.add("hehe");pq.add(true); //gives error as it is homogeneous
		pq.add(null);
//		pq.add("hehe");
		System.out.println(pq);
	}
	
	public static void set() {
		HashSet hs = new HashSet();
		hs.add(10);hs.add(12.24);hs.add('j');hs.add("hehe");hs.add(true);hs.add(null);hs.add("hehe");
		System.out.println(hs);
	}
	
	public static void map() {
		HashMap hm = new HashMap();
		hm.put(10,2);hm.put('j', "string");hm.put(true, false);hm.put(true,null);hm.put(10,"hehe");
		System.out.println(hm);
	}
}
