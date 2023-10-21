import java.util.Iterator;
import org.json.*;

public class MainClass {

	public static void main(String[] args) {
		
		String url = "http://172.18.80.1/week2/getSLChampion.php";
		
		try {
			HttpHandler httpHandler = new HttpHandler();
			JSONParser jsonParser = new JSONParser();
			
			String body = httpHandler.getResponseBody(url);
			JSONObject jo = jsonParser.parseStringToJSONObject(body);
			
			String owner = jsonParser.getValStringFrJSONObjectKey(jo, "owner");
			System.out.println("The owner of API is: " + owner);
			
			JSONObject data = (JSONObject) jo.get("data");
			
			Iterator<String> keys = data.keys();
			ChampionList cList = new ChampionList();
			while (keys.hasNext()) {
				String key = keys.next();
				String year = data.getJSONObject(key).getString("year");
				String image = data.getJSONObject(key).getString("image");
				cList.addChampion(new Champion(key, year, image));
			}
			cList.printInfo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}