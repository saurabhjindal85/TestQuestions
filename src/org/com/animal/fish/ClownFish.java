package org.com.animal.fish;


/*
ClownFish inherit property of fish
provide definition of appearance 
and makes jokes*/


public class ClownFish extends Fish {

	@Override
	public void appearance() {
		System.out.println("Clownfish are small and colourful (orange)");		
	}
	
	public void humour(){
		System.out.println("Clownfish make jokes");
	}

}


