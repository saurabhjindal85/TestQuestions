package org.com.animal.Bird;

/*Duck interited the properties of bird with diff sound and cannot swim
Duck property
walk
can swim
Quack, quack
fly*/

public class Duck extends Bird {

	@Override
	public void swim() {
		System.out.print("Duck Can Swim");
	}

	@Override
	public void sing() {
		System.out.print("Quack, quack");
	}

}
