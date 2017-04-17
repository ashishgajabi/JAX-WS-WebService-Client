package in.blogspot.ashish4java.globalweatherservice.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import in.blogspot.ashish4java.globalweatherservice.CityNotFoundException_Exception;
import in.blogspot.ashish4java.globalweatherservice.CityTemperature;
import in.blogspot.ashish4java.globalweatherservice.CityTemperatureImplService;

public class MainClient {

	public static final String city = "Sydney";

	public MainClient() {
	}

	public static void main(String[] args) {
		final CityTemperatureImplService cityTempService = new CityTemperatureImplService();
		CityTemperature client = cityTempService.getCityTemperatureImplPort();
		Map<String, Object> reqContext = ((BindingProvider) client).getRequestContext();

		Map<String, List<String>> authHeaders = new HashMap<String, List<String>>();
		authHeaders.put("UserName", Collections.singletonList("Ashish"));
		authHeaders.put("Password", Collections.singletonList("Password123"));

		reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, authHeaders);
		reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:80/GlobalWeatherService/CityTemperature?wsdl");
		try {
			String temp = client.getTemperatureOfCity(city);
			int statusCode = (int) ((BindingProvider) client).getResponseContext()
					.get(MessageContext.HTTP_RESPONSE_CODE);
			System.out.println("Status code = " + statusCode);
			System.out.println("Temperature of " + city + " is - " + temp);
		} catch (CityNotFoundException_Exception e) {
			System.out.println("Exception thrown - " + e.getMessage());
		}

	}

}
