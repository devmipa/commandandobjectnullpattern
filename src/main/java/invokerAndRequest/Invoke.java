package invokerAndRequest;

import java.util.ArrayList;
import java.util.List;

import CommandClasses.DocCommands;

public class Invoke {
	
	List<DocCommands> commandList;
	
	public Invoke() {
		this.commandList = new ArrayList<DocCommands>();
	}
	
	public void set(DocCommands command) {
		this.commandList.add(command);
	}
	
	public String executeCommands() {
		String result = "";
		for (DocCommands doc : this.commandList) {
			result = result + doc.execute() + "\n";
		}
		return result;
	}
	
	public String execute(DocCommands command) {
		return command.execute(); 
	}
	
	public List<DocCommands> getList(){
		return this.commandList;
	}

}
