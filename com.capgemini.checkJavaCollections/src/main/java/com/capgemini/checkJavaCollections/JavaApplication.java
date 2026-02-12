package com.capgemini.checkJavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public interface JavaApplication {
	public static void execution1() {
		LinkedList ll = new LinkedList();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addFirst("hello");
		ll.addFirst(null);
		ll.addFirst(null);
		ll.addFirst(4);
		ll.add(1, 9);
//		ll.removeLast();
		System.out.println(ll);
		
		LinkedList l2 = new LinkedList();
		l2.addFirst(2);
		l2.addFirst(1);
		l2.addFirst("hello");
		l2.addFirst(null);
		l2.addFirst(null);
		l2.addFirst(4);
		l2.add(1, 9);
		System.out.println(l2);
		System.out.println(ll.equals(l2));
		System.out.println(ll.hashCode());
		System.out.println(l2.hashCode());
		Object[] arr = ll.toArray();
		for(Object iterator : arr ) {
			System.out.println(iterator);
		}
	}
	
	public static void execution2() {
		Vector v1 = new Vector();
		v1.add(9);
		v1.add(1, 2);
		v1.add(2, 3);
		v1.add(null);
		v1.add(null);
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add(9);
		v2.add(1, 2);
		v2.add(2, 3);
		v2.add(null);
		v2.add(null);
		System.out.println(v2);
		
		System.out.println(v1.toString());
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}
	
	public static void execution3() {
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		
	}
}
