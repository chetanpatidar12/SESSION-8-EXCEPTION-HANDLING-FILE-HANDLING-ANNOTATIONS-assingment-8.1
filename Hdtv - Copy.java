package com.java.collection;

import java.util.Comparator;

public class Hdtv {
	
	
	String bandname;
	int size;
	
	
	public Hdtv(String bandname,int size) {
		
		this.bandname=bandname;
		this.size=size;
		
	
	}
	
	public String getBandname() {
		return bandname;
	}
	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
	public String toString(){
		return size+bandname;
		
	}

	
	

}
