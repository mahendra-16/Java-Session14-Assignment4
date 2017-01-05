package com.constructor;

public class Theta {
	
	private Alpha alpha;

	
	public Theta(Alpha alpha){
		System.out.println("Inside SpellChecker Constructor");
		this.alpha = alpha;
	}
	
	
	public void check(){
		alpha.proton();
		System.out.println("Inside CheckSpelling");
	}
	
	
}
