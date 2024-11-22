package com.gsv.multithread;

class MyRun implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<=100; i+=2) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
}

public class MyRunnableManager {
	public static void main(String[] args) {
		MyRun my = new MyRun();
		Thread t1 = new Thread(my);
		t1.start();
		for(int i=1; i<=100;i+=2) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
