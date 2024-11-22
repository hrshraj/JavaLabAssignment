package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Person{
	String pname;
	int age;
	public Person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return "Person [pname" + pname + ",age="+age+"]";
	}
}

class SortPersonName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		if(p1.pname.compareTo(p2.pname)>0) {
			return 1;
		}
		else if(p2.pname.compareTo(p1.pname)>0) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
}
class SortPersonAge implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		if(p1.age>p2.age) {
			return 1;
		}
		else if(p1.age<p2.age) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
}
public class PersonSortDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("Ankit", 28));
		list.add(new Person("Priyank", 24));
		list.add(new Person("Shailendra", 23));
		list.add(new Person("Ravi", 31));
		
		System.out.println("Before sort");
		System.out.println(list);
		 
		System.out.println("After sort based Name");
		Collections.sort(list, new SortPersonName());
		System.out.println(list);
		
		System.out.println("After age based sort");
		Collections.sort(list, new SortPersonAge());
		System.out.println(list);
		 
		
	}

}
