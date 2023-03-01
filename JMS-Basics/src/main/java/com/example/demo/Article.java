package com.example.demo;

public class Article {
	private int id;
	private String text;
	public Article() {}
	public Article(int id) {
		this.id = id;
	}
	public Article(int id, String text) {
		this.id = id;
		this.text = text;
	}	
	public void setText(String text) {
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	@Override
	public String toString() {
		return id + ", " + text;
	}
} 