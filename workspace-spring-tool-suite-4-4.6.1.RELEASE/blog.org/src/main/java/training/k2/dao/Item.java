package training.k2.dao;

import java.util.Date;

public class Item {
	
	private String title;
	private String content;
	private Date releaseData;
	private int id;
	
	public Item() {
	}
	
	public Item (String title, String content, Date releaseData, int id) {
		this.title = title;
		this.content = content;
		this.releaseData = releaseData;
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
	public Date getReleaseData() {
		return releaseData;
	}
	public void setReleaseData(Date releaseData) {
		this.releaseData = releaseData;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	
	
}
