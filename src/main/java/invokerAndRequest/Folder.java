package invokerAndRequest;

import java.util.ArrayList;
import java.util.List;

public class Folder {
	
	private int count;
	List<DocInterface> docList;
	
	public Folder() {
		this.count = 1;
		this.docList = new ArrayList<DocInterface>();
	}
	
	public String add() {
		Document doc = new Document("document " + this.count);
		this.count ++;
		this.docList.add(doc);
		return "The document was successfully added";
	}
	
	public DocInterface remove() {
		
		int size = docList.size();
		
		if(size > 0) {
			return docList.remove(size - 1);
		}
		
		return new NullDocument();
	}
	
	public String print() {
		String list = "";
		for(DocInterface d : docList) {
			list = list + d.getBody() + "\n";
		}
		return list;
	}
	
	public List<DocInterface> getList(){
		return this.docList;
	}

}
