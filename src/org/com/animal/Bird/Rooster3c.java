
package org.com.animal.Bird;

/*Implemented Rooster class without inheritance using the class proerty initialization in constructor
 * 
 *  this.sing = "Rooster can make voice of Cock-a-doodle-doo" ;
		this.fly = "Rooster cannot fly";
		Swim = "Rooster can swim";
		this.walk = "Rooster can fly";
*/

public class Rooster3c {

	String sing; 
	String fly;
	String Swim;
	String walk;
	
	public Rooster3c() {
		this.sing = "Rooster can make voice of Cock-a-doodle-doo" ;
		this.fly = "Rooster cannot fly";
		Swim = "Rooster can swim";
		this.walk = "Rooster can fly";
	}
	
	public void swim (){
		System.out.print(Swim);
	}
	
	public void fly(){
		System.out.println(fly);
	}
	public void sing(){
		System.out.println(sing);
	}
	public void walk(){
		System.out.println(walk);
	}

}
