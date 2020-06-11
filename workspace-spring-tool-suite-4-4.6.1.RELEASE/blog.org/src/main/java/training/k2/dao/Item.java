package training.k2.dao;

public class Item {
	
	private String title;
	private String content;
	public int id;
	
	public Item() {
	}
	
	public Item (String title, String content, int id) {
		this.title = title;
		this.content = content;
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	
	
}
