package interface04;

// 매개변수의 타입에 따라  알맞는 해석기 객체를 사용함
interface Parseable {
	void parse(String fileName);
}
class ParserManager{
	
	static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			return new JSONParser();
		}
	}
}

class JSONParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- json parse complete");
	}
}

class XMLParser implements Parseable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parse complete");
	}
}

public class ParseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parseable ps;

//		JSONParser jParser = new JSONParser();
//		ps=jParser;
//		ps.parse("doc.json");
//		XMLParser xParser = new XMLParser();
//		ps=xParser;
//		ps.parse("test");
		
		
		String fileName="XML";
		ps=ParserManager.getParser(fileName);
		ps.parse(fileName);
		fileName="JSON";
		ps=ParserManager.getParser(fileName);
		ps.parse(fileName);

	}

}

