package br.com.imexperts.content.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.imexperts.content.service.ContentService;

@RestController
public class ContentController {

	@Autowired
	private ContentService service;
	
	@RequestMapping(value="/treinamento/action={action}&text={text}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public String search(@PathVariable("action") String action, @PathVariable("text") String text) {
		return service.getResponse(action,text);
	}
}
