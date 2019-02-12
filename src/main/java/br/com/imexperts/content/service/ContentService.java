package br.com.imexperts.content.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ContentService {

	static final String REST_URI = "http://52.67.27.141:9100/";
	
	public String getResponse(String action, String text) {
		ClientConfig config = new DefaultClientConfig();   
        Client client = Client.create(config);
        WebResource service = client.resource(REST_URI);
        WebResource msgService = service
        		.queryParam("action", action)
        		.queryParam("Text", text)
        		.queryParam("ResponseFormat", "json")
        		.queryParam("Print", "fields")
        		.queryParam("PrintFields", "DRECONTENT");
        String msg = msgService.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        System.out.println(msg);
		return msg; 
	}	
}