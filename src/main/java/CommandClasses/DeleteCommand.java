package CommandClasses;

import invokerAndRequest.Folder;

public class DeleteCommand implements DocCommands{
	
	private Folder folder;
	
	public DeleteCommand(Folder folder) {
		this.folder = folder;
	}

	public String execute() {
		return this.folder.remove().getBody();
	}

}
