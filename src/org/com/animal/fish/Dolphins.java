package org.com.animal.fish;


/*implemented dolphin that swims without inheriting from a fish class

answer to part b -> implemented code using the class property and avoided code duplication. 
initializing class property in constructor

*/

public class Dolphins {
	String swim;
	String seaCreature;
	String fly;
	
	
	public Dolphins() {
		this.swim="Dolphins can Swim";
		this.seaCreature="Dolphins are seacreature";
		this.fly="Dolphins dont fly";
		}
	
	public void swim(){
		System.out.println(swim);
	}
	public void seaCreature(){
		System.out.println(seaCreature);
	}
	public void fly(){
		System.out.println(fly);
	}
	
}
