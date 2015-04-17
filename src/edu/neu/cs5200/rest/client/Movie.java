package edu.neu.cs5200.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)// ignore unknown
public class Movie {
	private String idIMDB;
	private String plot;
	private String urlPoster;
	private String title;
	
	
	//test
	private String champData;
	
	public String getChampData() {
		return champData;
	}
	public void setChampData(String champData) {
		this.champData = champData;
	}
	//test
	
	
	public String getIdIMDB() {
		return idIMDB;
	}
	public void setIdIMDB(String idIMDB) {
		this.idIMDB = idIMDB;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getUrlPoster() {
		return urlPoster;
	}
	public void setUrlPoster(String urlPoster) {
		this.urlPoster = urlPoster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
