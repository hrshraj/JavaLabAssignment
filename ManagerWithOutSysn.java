package com.gsv.multithread;
class Shared{
	public synchronized void set() {
		for(int i = 0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}

class MyThread1 extends Thread{
	Shared s1=null;
	public MyThread1(Shared s1) {
		this.s1 = s1;
		
	}
	@Override
	public void run() {
		s1.set();
	}
}

class MyThread2 extends Thread{
	Shared s1=null;
	public MyThread2(Shared s1) {
		this.s1= s1;
		
	}
	@Override
	public void run() {
		s1.set();
	}
}




public class ManagerWithOutSysn {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		MyThread1 t1 = new MyThread1(s1);
		MyThread2 t2 = new MyThread2(s2);
		t1.start();
		t2.start();
		
	}
	

}
