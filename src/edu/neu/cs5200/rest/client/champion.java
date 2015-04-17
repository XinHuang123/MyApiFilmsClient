package edu.neu.cs5200.rest.client;

import java.util.List;

//import javax.persistence.Id;



import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown=true)// ignore unknown
@Entity
public class champion {
	
	
	@Id
	private int id;
	private String key;
	private String name;
	private String title;
	
	private List<String> allytips;
	private String blurb;
	private List<String> enemytips;
	private InfoDto info;
	private String lore;
	private List<String> tags;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAllytips() {
		return allytips;
	}
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
	}
	public InfoDto getInfo() {
		return info;
	}
	public void setInfo(InfoDto info) {
		this.info = info;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public champion() {
		super();
	}
	/*
	public Champion(int id, String key, String name, String title,
			List<String> allytips, String blurb, List<String> enemytips,
			InfoDto info, String lore, List<String> tags) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.title = title;
		this.allytips = allytips;
		this.blurb = blurb;
		this.enemytips = enemytips;
		this.info = info;
		this.lore = lore;
		this.tags = tags;
	}
	*/
	public champion(int id, String key, String name, String title) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.title = title;
	}
	
}
