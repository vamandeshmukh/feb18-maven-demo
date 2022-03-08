package feb18.maven.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	public void testCase() {
		System.out.println("testCase");

		assertEquals(10, 10);
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2");

		assertNotEquals(10, 11);
	}
}
