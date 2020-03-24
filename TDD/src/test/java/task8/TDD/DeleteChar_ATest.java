package task8.TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteChar_ATest {

	@Test
	public void deleteCharTest() {
		DeleteChar_A dc = new DeleteChar_A();
		String actual1 = dc.deleteChar("ABCD");
		String actual2 = dc.deleteChar("AACD");
		String actual3 = dc.deleteChar("BACD");
		String actual4 = dc.deleteChar("BBAA");
		String actual5 = dc.deleteChar("AABAA");
		assertEquals("BCD",actual1);
		assertEquals("CD",actual2);
		assertEquals("BCD",actual3);
		assertEquals("BBAA",actual4);
		assertEquals("BAA",actual5);
	}
}
	
