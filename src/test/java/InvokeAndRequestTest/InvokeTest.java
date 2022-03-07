package InvokeAndRequestTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Test;

import CommandClasses.DeleteCommand;
import CommandClasses.*;
import invokerAndRequest.Folder;
import invokerAndRequest.Invoke;

public class InvokeTest {
	
	Invoke invoke = new Invoke();

	@Test
	public void testSet() {
		invoke.set(new DeleteCommand(new Folder()));
		assertEquals(1,invoke.getList().size());
	}
	
	@Test
	public void testExecute() {
		DocCommands command = mock(AddDocument.class);
		invoke.execute(command);
		verify(command, times(1)).execute();
	}
	
	@Test
	public void testExecuteCommands() {
		Invoke invoke2 = mock(Invoke.class);
		DocCommands command = mock(AddDocument.class);
		invoke.set(command);
		invoke.set(command);
		invoke.executeCommands();
		
		verify(command, times(2)).execute();
		
	}

}
