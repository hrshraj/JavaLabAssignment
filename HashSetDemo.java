package array;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(34);
		set.add(31);
		set.add(34);
		set.add(23);
		set.add(798);
		System.out.println(set);
		
		HashSet set1 = new HashSet();
		set1.add(56);
		set1.add(32);
		set1.add(34);
		set1.add(31);
		 
		System.out.println(set1);
		set1.addAll(set);
		System.out.println(set1);
		set1.contains(34);
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		set1.remove(34);
		set1.contains(34);
		set.retainAll(set);
		set1.clear();
		
		
		
		
		
	}

}
