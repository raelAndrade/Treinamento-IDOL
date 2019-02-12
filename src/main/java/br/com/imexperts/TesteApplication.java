package br.com.imexperts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import br.com.imexperts.content.service.ContentService;

@SpringBootApplication
public class TesteApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}
	
	@Bean
    public ContentService contentService() {
        return new ContentService();
    }
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	ClientConfig config = new DefaultClientConfig();   
//  Client client = Client.create(config);
//  WebResource service = client.resource(REST_URI);
//  WebResource msgService = service
//  		.queryParam("action", "query")
//  		.queryParam("Text", "*")
//  		.queryParam("print", "field")
//  		.queryParam("printField", "DRECONTENT");
//  String msg = msgService.accept(MediaType.APPLICATION_JSON_TYPE).get(String.class);
//  System.out.println(msg);

}

