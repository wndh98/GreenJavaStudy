package class04_static;

class Document {
	// class variable
	static int count;
	static int totalCount;
	// instance variable
	String name;

	
	public Document() {
		this("�������" + ++count);
		System.out.println("�⺻������");
		
	}
	public Document(String name) {
		System.out.println("�Ű����� 1��");
		this.name = name;
		totalCount++;
		System.out.println("����" + name + "������");
		
	}
	// static ��� (static �ʱ�ȭ ���)
	static {
		System.out.println("����ƽ���");
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

