package ch11.exam08;

import java.util.Date;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date wirteData;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWirteData() {
		return wirteData;
	}
	public void setWirteData(Date wirteData) {
		this.wirteData = wirteData;
	}
	
	
}
