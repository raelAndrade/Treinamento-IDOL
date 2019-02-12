package br.com.imexperts.content.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "responsedata")
public class ResponseData {

	private static final String NAMESPACE = "http://schemas.autonomy.com/aci/";
	
	private Integer numhits = 0;
	private List<ContentHit> hits  = new ArrayList<>();
	
	@XmlElement(name = "numhits", namespace = NAMESPACE)
	public Integer getNumhits() {
		return numhits;
	}
	
	public void setNumhits(Integer numhits) {
		this.numhits = numhits;
	}
	
	@XmlElement(name = "hit", namespace = NAMESPACE)
	public List<ContentHit> getHits() {
		return hits;
	}
	
	public void setHits(List<ContentHit> hits) {
		this.hits = hits;
		this.numhits = hits.size();
	}

	public ContentHit getFirst() {
		if(!hits.isEmpty()) return hits.get(0);
		else return new ContentHit();
	}
	public ContentHit getFirst(ContentHit deflt) {
		if(!hits.isEmpty()) return hits.get(0);
		else return deflt;
	}
}
