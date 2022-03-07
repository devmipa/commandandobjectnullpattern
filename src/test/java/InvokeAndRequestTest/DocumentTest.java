package InvokeAndRequestTest;

import static org.junit.Assert.*;

import org.junit.Test;

import invokerAndRequest.*;

public class DocumentTest {
	
	Document doc = new Document("Hello");

	@Test
	public void test() {
		String expectedVal = "Hello";
		assertEquals(expectedVal,doc.getBody());
	}

}
