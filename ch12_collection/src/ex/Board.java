package ex;

public class Board {
	String title;
	String content;

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

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
