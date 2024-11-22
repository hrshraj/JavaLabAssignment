package array;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
	String sname;
	int age;
	double marks;
	public Student(String sname, int age, double marks) {
		super();
		this.sname = sname;
		this.age = age;
		this.marks = marks; 
	   
	}
	public String toString() {
		return sname+" "+age+" "+marks;
		
	} 


@Override
public int compareTo(Object o) {
	Student s = (Student)o;
	if(this.age>s.age) {
		return 1;
	}
	else if(this.age<s.age) {
		return -1;
	}
	else {
		return 0;
	}
	
}}

public class ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> dsai = new ArrayList<Student>();
		dsai.add(new Student("Ankit",23, 67.8));
		dsai.add(new Student("Anu",28, 54.9));
		dsai.add(new Student("Amit",21, 77.8));
		dsai.add(new Student("Ragu",26, 61.8));
		Collections.sort(dsai);
		System.out.println(dsai); 
	} 

}


