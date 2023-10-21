import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {
	
	public JSONObject parseStringToJSONObject(String body) throws Exception {
		JSONObject json = null;
		try {
			json = new JSONObject(body);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	public JSONArray GetJSONArrayFromJSONObjectKey(JSONObject jo, String arr_key) throws Exception {
		JSONArray jarr = null;
		try {
			jarr = (JSONArray) jo.get(arr_key);
		} catch (JSONException e) {
            e.printStackTrace();
        }
		return jarr;
	}
	
	public JSONObject getArrayDataAtIndex(JSONArray jarr, int i) {
		JSONObject json_obj = (JSONObject)jarr.get(i);
		return json_obj;
	}
	
	public int getValIntFrJSONObjectKey(JSONObject jo, String key) throws Exception {		
		String total = "0";
        try {
            total = jo.get(key).toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }            
        return Integer.parseInt(total);
	}
	
	public String getValStringFrJSONObjectKey(JSONObject jo, String key) throws Exception {
		String val = null;
		try {
			val = jo.getString(key).toString(); 
		} catch (JSONException e) {
		    e.printStackTrace();
        }         	
		return val;
	}
	
}
