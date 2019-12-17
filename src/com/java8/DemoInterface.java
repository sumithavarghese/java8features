package com.java8;

interface Phone{
	void call();
	default void message(){
	System.out.println("sent");	
	}
}


class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("Calling");
		
	}
	
}
public class DemoInterface {
	
	 public static void main(String[] args) {
		 
		 Phone p= new AndroidPhone();
		 p.call();
		
	}

}
