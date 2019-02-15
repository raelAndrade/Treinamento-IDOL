package br.com.imexperts.content.service;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

@Service
public class ContentService {

	//private RestTemplate restTemplate;
	static final String REST_URI = "http://54.232.215.49:9100/";
	
	public String getResponse(String action, String text) {
		ClientConfig config = new DefaultClientConfig();   
        Client client = Client.create(config);
        WebResource service = client.resource(REST_URI);
        WebResource msgService = service
        		.queryParam("action", action)
        		.queryParam("Text", text)
        		.queryParam("ResponseFormat", "json")
        		.queryParam("Print", "fields")
        		.queryParam("PrintFields", "DRECONTENT,DRETITLE")
        		.queryParam("Summary", "Context")
        		.queryParam("Characters","200");
        String obj = msgService.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        obj = obj.replace("autn:", "autn");
        System.out.println(obj);
		return obj;
	}
	
//	public QueryResponse buscar(String action, String text) {
//		RequestEntity<Void> request = RequestEntity
//				.get(URI.create(REST_URI))
//				.build();
//		ResponseEntity<QueryResponse> response = restTemplate.exchange(request, QueryResponse.class);
//
//		return response.getBody();
//	}
}