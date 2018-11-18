
package org.com.animal.test.Bird;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.com.animal.Bird.Bird;
import org.com.animal.Bird.Chicken;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestChicken {


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

	// using this test we are testing the chicken Class Sing function
	@Test
	public void birdSingTest(){
		Chicken bird = new Chicken();
		bird.sing();
	    assertEquals("Cluck, cluck", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
	// using this test we are testing the chicken Class swim function
	@Test
	public void birdWalkTest(){
		Chicken bird = new Chicken();
		bird.swim();
	    assertEquals("Chicken Cannot Swim", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
}
