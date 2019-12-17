package com.java8;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

class ConsImpl implements Consumer<Integer>{

	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
	}
	
}

public class DemoForEach {
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		
		
		
		
		values.forEach(i->System.out.println(i));
		}

}
