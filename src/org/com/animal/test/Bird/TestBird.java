
package org.com.animal.test.Bird;

import org.com.animal.Bird.Bird;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*junit test for the Bird class*/

public class TestBird {

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

	// using this test we are testing the Bird Class Sing function
	@Test
	public void birdSingTest(){
		Bird bird = new Bird();
		bird.sing();
	    assertEquals("i can sing", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
	// using this test we are testing the Bird Class walk function
	@Test
	public void birdWalkTest(){
		Bird bird = new Bird();
		bird.walk();
	    assertEquals("I can walk", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
	
	// using this test we are testing the Bird Class Swim function
	@Test
	public void birdSwimTest(){
		Bird bird = new Bird();
		bird.swim();
	    assertEquals("I cannot Swim", outContent.toString());
		//assertEquals("I can Swim", actual);
	}
}
