package com.app.fruits;

public class Orange 
extends Fruit
{
	private String taste;

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		this.setTaste(taste);
		this.isFresh();
		this.setFresh(isFresh());
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String toString()
	{
		return this.getName()+"--"+this.getColor()+"--"
				+this.getWeight()+"--"+this.Taste()+"--"+this.isFresh();
		}
	public String Taste()

	{
	   this.taste="sour";
	   return this.taste;
	}
}
