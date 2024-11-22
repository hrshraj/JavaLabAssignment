package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;

public class ArrayListDem2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add(10);
		list1.add(10.4);
		list1.add(122.3);
		list1.add("GSV");
		list1.add(null);
		list1.add(true);
		list1.add('C');
		
		System.out.println(list1);
		
		for(int i = 0; i<list1.size(); i++) {
			Object obj1 = list1.get(i);
			if(obj1 instanceof Integer) {
				System.out.println(obj1);
				Integer i1 = (Integer)obj1;
				System.out.println("Integer"+i1);
				
			}
			if(obj1 instanceof Float) {
				System.out.println(obj1);
				Float f1 = (Float)obj1;
				System.out.println("Float"+f1);
				
			}
			if(obj1 instanceof String) {
				System.out.println(obj1);
				String s1 = (String)obj1;
				System.out.println("String"+s1);
				
			}
			if(obj1 instanceof Boolean) {
				System.out.println(obj1);
				Boolean b1 = (Boolean)obj1;
				System.out.println("Boolean"+b1);
				
			}
		}
		System.out.println("Iterator.....");
		
		Iterator iter = list1.iterator();
		while(iter.hasNext()) {
			Object obj2 = iter.next();
			list1.set(3,4000);
			System.out.println(obj2);
			
			
		}
		
		System.out.println(list1);
		System.out.println("Forward....");
		ListIterator listiter = list1.listIterator();
		
		while(listiter.hasNext()) {
			Object obj2 = listiter.next();
			System.out.println(obj2);
		}
		
		System.out.println("Back....");
		while(listiter.hasPrevious()) {
			Object obj2 = listiter.previous();
			System.out.println(obj2);
		}
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("344");
//		list3.add(33);
		
//		list1.addFirst("AI GSV");
//		list1.addLast("AI GSV");
		
		System.out.println(list3);
		
		list3.isEmpty();
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		
		i1.add(34);
		i1.add(37);
		i1.add(39);
		i1.add(33);
		i1.add(31);
		
		
		ArrayList<Integer> i2 = new ArrayList<Integer>();
		
		i1.add(24);
		i1.add(37);
		i1.add(19);
		i1.add(33);
		i1.add(31);
		
		System.out.println("I1:"+i1);
		System.out.println("I2:"+i2);
		
//		System.out.println(i1);
//		System.out.println(i1.containsAll(i2));
		
		
		i1.addAll(i2);
		System.out.println(i1);
		
		Collections.sort(i1);
		System.out.println(i1);
		
		System.out.println(Collections.binarySearch(i1, 34));
//		
		
	}
	  
 
}
