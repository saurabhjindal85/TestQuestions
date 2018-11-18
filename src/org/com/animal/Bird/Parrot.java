package org.com.animal.Bird;

/*we are using class property sound to keep the Parrot sound maintainable. 
while creating the Parrot object we can pass the choice of sound for the parrot
in case no sound pass default paramter will assign original voice to parrot
*/

public class Parrot extends Bird{

	String sound;

	public Parrot() {
		this.sound = "Parrot original sound";
	}


	public Parrot(String sound) {
		this.sound = sound;
	}

	@Override
	public void sing() {
		System.out.println(sound);
	}
	
}