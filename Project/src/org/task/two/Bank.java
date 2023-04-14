package org.task.two;

public class Bank implements ICICI{

	@Override
	public void savings() {
	System.out.println("8%");	
	
	}

	@Override
	public void fixed() {
	System.out.println("9%");
	}

	@Override
	public void deposit() {
	System.out.println("7%");
		
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.savings();
		b.fixed();
		b.deposit();
	}

}
