package module_3_collections_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public interface JavaApplication {
	public static void list() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(-3);
		al1.add(-1);
		al1.add(2);
		al1.add(10);
		al1.add(-3);
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(-3);
		al2.add(-1);
		al2.add(2);
		al2.add(10);
		al2.add(-3);
		System.out.println(al2);
		
		System.out.println(al1.equals(al2));
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());
		System.out.println();
	}
	
	public static void queue() {
		PriorityQueue<Double> pq1 = new PriorityQueue<Double>();
		pq1.add(11.11);pq1.add(-22.22);pq1.add(33.33);pq1.add(-44.44);
		System.out.println(pq1);
		PriorityQueue<Double> pq2 = new PriorityQueue<Double>();
		pq2.add(11.11);pq2.add(-22.22);pq2.add(33.33);pq2.add(-44.44);
		System.out.println(pq2);
		System.out.println(pq1.equals(pq2));
		System.out.println(pq1.hashCode());
		System.out.println(pq2.hashCode());
		System.out.println();
	}
	
	public static void set() {
		HashSet<Character> hs1 = new HashSet<Character>();
		hs1.add('q');hs1.add('R');hs1.add('5');hs1.add('*');
		System.out.println(hs1);
		HashSet<Character> hs2 = new HashSet<Character>();
		hs2.add('q');hs2.add('R');hs2.add('5');hs2.add('*');
		System.out.println(hs2);
		System.out.println(hs1.equals(hs2));
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		System.out.println();
	}
	
	public static void map() {
		HashMap<Integer,Double> hm1 = new HashMap<Integer,Double>();
		hm1.put(1,11.11);hm1.put(-2,-22.22);hm1.put(3,33.33);hm1.put(-4,44.44);
		System.out.println(hm1);
		HashMap<Integer,Double> hm2 = new HashMap<Integer,Double>();
		hm2.put(1,11.11);hm2.put(-2,-22.22);hm2.put(3,33.33);hm2.put(-4,44.44);
		System.out.println(hm2);
		System.out.println(hm1.equals(hm2));
		System.out.println(hm1.hashCode());
		System.out.println(hm2.hashCode());
		System.out.println();
	}
}
