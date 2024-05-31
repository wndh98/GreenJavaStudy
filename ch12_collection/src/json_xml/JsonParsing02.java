package json_xml;

import java.util.Iterator;

import org.json.JSONObject;

public class JsonParsing02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonString =
	              "{"
	              +   "\"post1\": {"
	              +       "\"title\": \"how to get stroage size\","
	              +       "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
	              +       "\"draft\": false"
	              +"  },"
	              +   "\"post2\": {"
	              +       "\"title\": \"Android Q, Scoped Storage\","
	              +       "\"url\": \"https://codechacha.com/ko/android-q-scoped-storage/\","
	              +       "\"draft\": false"
	              +   "}"
	              +"}";
		JSONObject json = new JSONObject(jsonString);
		Iterator it = json.keys();

		for(int i=0;i<json.length();i++) {
			JSONObject innerJson=json.getJSONObject((String)it.next());
			System.out.println(innerJson);
		}
	}

}

// 
