package com.app.fruits;

public class Fruit 
{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String color, double weight, String name) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;

	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	public String toString()
	{
		return this.getName()+"--"+this.getColor()+"--"
				+this.getWeight()+"--"+this.Taste()+"--"+this.isFresh();
		}
	public String Taste()

	{
       return "no specific taste";
	}
	 		
	
	

}
