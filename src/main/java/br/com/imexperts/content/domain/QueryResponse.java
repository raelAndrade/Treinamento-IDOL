package br.com.imexperts.content.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "autnresponse")
public class QueryResponse {

	private String action;
	private String response;
	
	private ResponseData respData = new ResponseData();

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@XmlElement(name = "response")
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@XmlElement(name = "responsedata")
	public ResponseData getRespData() {
		return respData;
	}

	public void setRespData(ResponseData respData) {
		this.respData = respData;
	}

	@Override
	public String toString() {
		return "QueryResponse [action=" + action + ", response=" + response + ", respData=" + respData + "]";
	}
}
