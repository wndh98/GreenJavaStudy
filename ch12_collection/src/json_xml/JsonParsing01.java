package json_xml;

import org.json.JSONObject;

public class JsonParsing01 {

	public static void main(String[] args) {
		String jsonString = "{\"title\": \"how to get stroage size\","
				+ "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
				+ "\"draft\": false," + "\"star\": 10" + "}";
		
		JSONObject json = new JSONObject(jsonString);
//		System.out.println(json);
		System.out.println(json.getString("title"));
		
		System.out.println(json.getString("url"));
		
		System.out.println(json.getBoolean("draft"));
		System.out.println(json.getInt("star"));
		
	}

}
