package com.java8;

interface A{
	 void show(int i);
}

class Xyz implements A{
	public void show(){
		
		System.out.println("Hello");
	}

	@Override
	public void show(int i) {
		// TODO Auto-generated method stub
		
	}
}
public class DemoLambda {
	
	public static void main(String[] args) {
		
		
		A obj;
		
		obj= i-> System.out.println("hello"+i);
			
		
		obj.show(6);
	}

}
