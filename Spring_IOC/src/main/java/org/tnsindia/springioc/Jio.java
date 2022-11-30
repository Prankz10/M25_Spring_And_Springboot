package org.tnsindia.springioc;

public class Jio implements Sim{

	public void calling() {
		System.out.println("Calling using Jio number");
		
	}

	public void data() {
		System.out.println("Internet using Jio SIM");
		
	}
	public Jio() {
		super();
		System.out.println("Jio class Constructor");
	}

}