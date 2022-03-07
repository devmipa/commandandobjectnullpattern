package invokerAndRequest;

public class Document implements DocInterface{
	
	private String body;
	
	public Document(String message) {
		this.body = message;
	}

	public String getBody() {
		return this.body;
	}

}
