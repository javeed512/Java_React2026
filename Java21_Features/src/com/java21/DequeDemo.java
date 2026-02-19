package com.java21;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.ListIterator;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("JDK 17");
		deque.addLast("JDK 21");
		String front = deque.getFirst();  // "JDK 17"
		String back = deque.getLast();    // "JDK 21"
		
		
		System.out.println(front);
		
		System.out.println(back);
		
		
		
		
		
		
		
		List<String> events = Arrays.asList("Event1", "Event2", "Event3");
		ListIterator<String> reverseIterator = events.listIterator(events.size());
		while (reverseIterator.hasPrevious()) {
		    System.out.println(reverseIterator.previous());
		}
		
	}

}
