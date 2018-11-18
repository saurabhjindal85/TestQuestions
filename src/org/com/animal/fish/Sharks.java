package org.com.animal.fish;


/*
Sharks inherit property of fish
provide definition of appearance 
and food type*/


public class Sharks extends Fish{

	@Override
	public void appearance() {
		System.out.println("Sharks are large and grey");
		
	}
	
	public void food(){
		System.out.println("Sharks eats other fish");
	}
	

}