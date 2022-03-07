package InvokeAndRequestTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import CommandClasses.AddDocument;
import CommandClasses.DocCommands;
import invokerAndRequest.Folder;

public class AddDocumentTest2 {

	Folder folder = new Folder();
	DocCommands command = new AddDocument(folder);

	@Test
	public void test() {
		String expectedValue = "The document was successfully added";
		
		assertEquals(expectedValue,command.execute());
	}

}
