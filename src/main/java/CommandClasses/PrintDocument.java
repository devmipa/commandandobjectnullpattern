package CommandClasses;

import invokerAndRequest.Folder;

public class PrintDocument implements DocCommands{
	
	private Folder folder;
	
	public PrintDocument(Folder folder) {
		this.folder = folder;
	}

	public String execute() {
		
		return this.folder.print();
	}

}
