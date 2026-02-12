package iterations;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public interface JavaApplication {
	public static void list() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(-2);
		al.add(3);
		al.add(-4);
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		for(Integer integer : al) {
			System.out.print(integer + " ");
		}
		System.out.println();
		Iterator<Integer> iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		ListIterator<Integer> listIterator = al.listIterator(4);
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
		al.set(1,871);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
	}
	
	public static void map() {
		HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
		hm.put(1, 11.11);
		hm.put(-2, -22.22);
		hm.put(3, 33.33);
		hm.put(-4, -44.44);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		hm.replace(-2, 123.456);
		hm.remove(3);
		System.out.println(hm);
	}
	
	public static void set() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(3);
		hs.add(5);
		hs.add(8);
		System.out.println(hs);
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	
	public static void queue() {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(-2);
		pq.add(3);
		pq.add(-4);
		System.out.println(pq);
		Iterator<Integer> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
}
