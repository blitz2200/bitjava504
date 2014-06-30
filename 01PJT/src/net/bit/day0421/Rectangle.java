package net.bit.day0421;

public class Rectangle {
	private int width;
	private int length;
	private String color;
	
	public Rectangle(){
		length = 0;
		width = 0;
		color = "";
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return length;
	}
	public int area(){
		return length*width;
	}
	public int perimiter(){
		return length*2+width*2;		
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	

}
