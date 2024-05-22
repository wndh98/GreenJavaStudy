package class04_static;

class Document {
	// class variable
	static int count;
	static int totalCount;
	// instance variable
	String name;

	
	public Document() {
		this("제목없음" + ++count);
		System.out.println("기본생성자");
		
	}
	public Document(String name) {
		System.out.println("매개변수 1개");
		this.name = name;
		totalCount++;
		System.out.println("문서" + name + "생성됨");
		
	}
	// static 블록 (static 초기화 블록)
	static {
		System.out.println("스태틱블록");
		//count=10;
		
	}

}

public class DocumentEx {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document("java");
		Document doc3 = new Document();
		
		System.out.println(Document.totalCount);
	}

}
// 

