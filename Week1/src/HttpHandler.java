import com.mashape.unirest.http.*;

public class HttpHandler {
	
	public String getResponseBody(String url) throws Exception {
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.get(url).asString();
		String data = response.getBody();
		
		return data;
	}
	
}
