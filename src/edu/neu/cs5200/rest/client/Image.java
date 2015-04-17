package edu.neu.cs5200.rest.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)// ignore unknown
public class Image {
	public Image(String full, String group, int h, String sprite, int w, int x,
			int y) {
		super();
		this.full = full;
		this.group = group;
		this.h = h;
		this.sprite = sprite;
		this.w = w;
		this.x = x;
		this.y = y;
	}
	public Image() {
		super();
	}
	private String full;
    private String group;
    private int h;
    private String sprite;
    private int w;
    private int x;
    private int y;
	
    public String getFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
    
}
