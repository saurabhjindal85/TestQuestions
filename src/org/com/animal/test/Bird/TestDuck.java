

package org.com.animal.test.Bird;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.com.animal.Bird.Bird;
import org.com.animal.Bird.Duck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDuck {


	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	// using this test we are testing the Duck Class Sing function
	@Test
	public void birdSingTest(){
		Duck duck = new Duck();
		duck.sing();
	    assertEquals("Quack, quack", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
	// using this test we are testing the duck Class swim function
	@Test
	public void birdWalkTest(){
		Duck duck = new Duck();
		duck.swim();
	    assertEquals("Duck Can Swim", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
}



