package InvokeAndRequestTest;

import static org.junit.Assert.*;

import org.junit.Test;

import invokerAndRequest.DocInterface;
import invokerAndRequest.Folder;

public class FolderTest {
	
	Folder folder = new Folder();
	@Test
	public void testAdd() {
		folder.add();
		assertEquals(1,folder.getList().size());
	}
	
	@Test
	public void testRemove() {
		folder.remove();
		assertEquals(0,folder.getList().size());
	}
	
	@Test
	public void testNullObject() {
		DocInterface nullDoc = folder.remove();
		String expectedValue = "You dont have more documments";
		assertEquals(expectedValue,nullDoc.getBody());
	}
	
	@Test
	public void printList() {
		folder = new Folder();
		folder.add();
		String expectedValue = "document 1\n";
		
		assertEquals(expectedValue,folder.print());
	}

}
