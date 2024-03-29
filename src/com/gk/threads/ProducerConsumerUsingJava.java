package com.gk.threads;

class Q{
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num){
		while(valueSet){
			try{wait();}catch(Exception e){};
		}
		System.out.println("Set: "+num);
		this.num=num;
		valueSet=true;
		notify();
	}
	public synchronized void get(){
		while(!valueSet){
			try{wait();}catch(Exception e){};
		}
		System.out.println("Get: "+num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	public Producer(Q q){
		this.q = q;
		Thread thread = new Thread(this,"Producer");
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i= 0;
		while(true){
			q.put(i++);
			try{Thread.sleep(1000);} catch(Exception e){};
		}
	}
	
}

class Consumer implements Runnable{
	Q q;
	public Consumer(Q q){
		this.q = q;
		Thread thread = new Thread(this,"Consumer");
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			q.get();
			try{Thread.sleep(1000);} catch(Exception e){};
		}
		
	}
}
public class ProducerConsumerUsingJava {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
