package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

	public HeaderConfigs() {

	}

	//Postman Params - Headers
	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("Status", "200 OK");
		
		return defalutHeaders;

	}


	public Map<String, String> headersWithToken(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("Acess_Token", "dummy-sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");

		return defalutHeaders;

	}


}
