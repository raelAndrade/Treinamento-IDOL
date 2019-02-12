package br.com.imexperts.content.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "hit", namespace = "http://schemas.autonomy.com/aci/")
public class ContentHit {

	private static final String NAMESPACE = "http://schemas.autonomy.com/aci/";
	
	private String reference;
	private Long id;
	private Long section;
	private Double weight;
	private String database = "";
	private String title = "";
	private String language = "";
	private Content content = new Content();

	public ContentHit() {
	}

	public ContentHit(ContentHit hit) {
		this.reference = hit.getReference();
		this.id = hit.getId();
		this.section = hit.getSection();
		this.weight = hit.getWeight();
		this.database = hit.getDatabase();
		this.title = hit.getTitle();
		this.language = hit.getLanguage();
	}

	@XmlElement(name = "reference", namespace = NAMESPACE)
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@XmlElement(name = "id", namespace = NAMESPACE)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlElement(name = "section", namespace = NAMESPACE)
	public Long getSection() {
		return section;
	}

	public void setSection(Long section) {
		this.section = section;
	}
	
	@XmlElement(name = "weight", namespace = NAMESPACE)
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@XmlElement(name = "database", namespace = NAMESPACE)
	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@XmlElement(name = "title", namespace = NAMESPACE)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlElement(name = "content", namespace = NAMESPACE)
	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
	
}
