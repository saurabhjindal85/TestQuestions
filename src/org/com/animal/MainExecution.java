package org.com.animal;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.com.animal.Bird.Bird;
import org.com.animal.Bird.Chicken;
import org.com.animal.Bird.Duck;
import org.com.animal.Bird.Parrot;
import org.com.animal.Bird.Rooster;
import org.com.animal.Bird.Rooster3c;
import org.com.animal.fish.ClownFish;
import org.com.animal.fish.Dolphins;
import org.com.animal.fish.Sharks;
import org.com.animal.insect.ButterFly;
import org.com.animal.insect.FromCaterPillarToButterfly;

import com.sun.java.accessibility.util.SwingEventMonitor;
import com.sun.media.jfxmedia.events.NewFrameEvent;



public class MainExecution {

	public static void main(String[] str) throws IOException{
		//************Question 1 execution*******************
		System.out.println("\n************Question 1 execution*******************\n");
		Bird bird = new Bird();
		bird.sing();
		bird.fly();
		bird.walk();
		
		//************Question 2 execution*******************
		System.out.println("\n************Question 2 execution*******************\n");
		Chicken chicken = new Chicken();
		chicken.fly();
		chicken.sing();
		
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		System.out.println("\n************Question 3 execution*******************\n");

		Rooster rooster = new Rooster();
		rooster.sing();
		
		System.out.println("\n************Question 3c execution*******************\n");

		Rooster3c rooster3c = new Rooster3c();
		rooster3c.sing();
		rooster3c.swim();
		
		System.out.println("\n************Question 4 execution*******************\n");

		Parrot parrot1 = new Parrot("woof,woof");
		Parrot parrot2 = new Parrot("Meow");
		Parrot parrot3 = new Parrot("cock-a-doodle-doo");
		parrot1.sing();
		parrot2.sing();
		parrot3.sing();
		
		System.out.println("\n************Question 2 Part B  execution*******************\n");
		
		Sharks shark = new Sharks();
		shark.appearance();
		shark.food();
		
		ClownFish clownFish = new ClownFish();
		clownFish.appearance();
		clownFish.humour();
		
		System.out.println("\n************Question 3 Part B  execution*******************\n");
		
		Dolphins dolphins = new Dolphins();
		dolphins.swim();
		dolphins.seaCreature();
		dolphins.fly();
		
		System.out.println("\n************Question 1 and 2 Part D  execution*******************\n");
		
		ButterFly butterFly = new ButterFly();
		butterFly.fly();
		butterFly.sing();
		
		FromCaterPillarToButterfly butterfly2 = new FromCaterPillarToButterfly();
		System.out.println("CaterPillar state beofre transformation");
		butterfly2.fly();
		butterfly2.walk();
		
		System.out.println("changing caterpillar state to butterfly using transformation");
		butterfly2.transform();
		
		System.out.println("ButterFly state after transformation");
		butterfly2.fly();
		butterfly2.walk();
		
		System.out.println("\n************Question Counting animals  execution*******************\n");
		
		
		Animal[] animalArray = new Animal[]{
			new Duck(),
			new Chicken(),
			new Parrot(),
			new Rooster(),
			new Sharks(),
			new ButterFly()
			};
		int swim = 0;
		int fly = 0;
		int walk= 0;
		int sing = 0;
		for (Animal animal : animalArray){		

			if(animal instanceof Duck){
				swim+=1;
				fly+=1;
				walk+=1;
				sing+=1;
			}else if (animal instanceof Chicken){
				walk+=1;
				sing+=1;
			}else if (animal instanceof Parrot){
				fly+=1;
				walk+=1;
				sing+=1;
			}else if (animal instanceof Rooster){
				walk+=1;
				sing+=1;
			}else if (animal instanceof Sharks){
				swim+=1;
			}else if (animal instanceof ButterFly){
				fly+=1;
			}
			
		}
		
		System.out.println("Count of Animal who can swim :- "+ swim);
		System.out.println("Count of Animal who can walk :- "+ walk);
		System.out.println("Count of Animal who can sing :- "+ sing);
		System.out.println("Count of Animal who can fly :- "+ fly);
		
	}

}
