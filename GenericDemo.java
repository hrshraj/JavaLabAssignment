package gsv.dsa;

class A{
	public String toString() {
		return "A";
	}
}

class B extends A{
	public String toString() {
		return "B";
	}
}

class Test < T extends A>{
	T t;
	Test(T t){
		this.t = t;}
	void print() {
		System.out.println(t);  //t.toString
		}
	}


public class GenericDemo {
	public static void main(String[] args) {
		Test<A> t1 = new Test<A>(new A());
		t1.print();
		Test<B> t2 =new Test<B>(new B());
		t2.print();
		Test<A> t3 = new Test<A>(new B());
		t3.print();
		
		
	}

}

