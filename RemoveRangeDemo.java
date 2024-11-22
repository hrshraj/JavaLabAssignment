package array;

import java.util.ArrayList;
import java.util.List;

public class RemoveRangeDemo extends ArrayList{
	public static void main(String[] args) {
		
		RemoveRangeDemo rd = new RemoveRangeDemo();
		
		
		rd.add(34);
		rd.add(324);
		rd.add(348);
		rd.add(314);
		rd.add(384);
		rd.add(344);
		rd.removeRange(0, 4);
		
		System.out.println(rd);
		
		ArrayList list1 = new ArrayList();
		
		list1.add(34);
		list1.add(37);
		list1.add(2);
		list1.add(348);
		list1.add(21);
		
		Object all[] = list1.toArray();
		for(Object a: all) {
			System.out.println(a);
		}
		
		System.out.println(list1.indexOf(34));
		System.out.println(list1.lastIndexOf(314));
//		List sublist = list1.add(lastIndexof);
		
		
		
		
	}

}
 