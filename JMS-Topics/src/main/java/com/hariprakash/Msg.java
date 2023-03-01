package com.hariprakash;

public class Msg {
	private String title;
	
	public Msg() {}
	public Msg(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}	  
	@Override
	public String toString() {
		return  title;
	}
}
