package org.task;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=1, b=2;
		
		System.out.println(a);
		
		System.out.println(b);
		
		for (int i = 2; i <=10; i++) {
			
			int c=a+b;	
			
			System.out.println(c);
			
			a=b;
			b=c;
		
		}}
}
