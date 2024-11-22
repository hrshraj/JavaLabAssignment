package array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList<String> car = new LinkedList<String>();
		car.add("Mini");
		car.add("Mcclaren");
		car.add("Masseriti");
		car.add("Buggati");
		
		System.out.println(car);
		
		car.addFirst("45");
		
		System.out.println(car);
		
		
		Vector v1 = new Vector();
		v1.add(34);
		v1.add("MG"); 
		v1.remove(0);
		
		
		System.out.println(v1);
		
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(23);
		deque.add(21);
		deque.add(27);
		deque.add(29);
		
		deque.addFirst(34);
		deque.addLast(21);
		deque.removeFirst();
		deque.pollLast();
		deque.peek();
		System.out.println(deque);
		
		Stack<String> s1 = new Stack<String>();
		s1.push("45");
		s1.pop();
		System.out.println(s1);
		
	}
	
  
}
