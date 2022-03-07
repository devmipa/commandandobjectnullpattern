package CommandClasses;

import invokerAndRequest.Folder;

public class AddDocument implements DocCommands{
	
	private Folder folder;
	
	public AddDocument(Folder folder) {
		this.folder = folder;
	}

	public String execute() {
		return folder.add();
	}

}
