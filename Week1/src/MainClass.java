import org.json.*;

public class MainClass {

	public static void main(String[] args) {
		
		String url = "https://reqres.in/api/users/";
		
		try {
			HttpHandler httpHandler = new HttpHandler();
			JSONParser jsonParser = new JSONParser();
			
			String body = httpHandler.getResponseBody(url);
			JSONObject jo = jsonParser.parseStringToJSONObject(body);
			JSONArray jarr = jsonParser.GetJSONArrayFromJSONObjectKey(jo, "data");
			
			int length = jsonParser.getValIntFrJSONObjectKey(jo, "per_page");

			for (int i = 0; i < length; i++) {
				JSONObject jo_current = jsonParser.getArrayDataAtIndex(jarr, i);
				String fname = jsonParser.getValStringFrJSONObjectKey(jo_current, "first_name");
				String lname = jsonParser.getValStringFrJSONObjectKey(jo_current, "last_name");
				
				System.out.println("first name: " + fname + " last name: " + lname);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}