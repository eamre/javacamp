package kodlamaio.devs.entities.concretes;

public class ProgLanguage {
	
	private int id;
	private String name;
	
	public ProgLanguage() {
		super();
	}

	public ProgLanguage(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
