package com.app.fruits;

public class Apple extends Fruit
{
	private String taste;
	
	public Apple(String color, double weight, String name) {
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
@Override
	public String toString()
	{
		return this.getName()+"--"+this.getColor()+"--"
+this.getWeight()+"--"+this.Taste()+"--"+this.isFresh();
		}
public String Taste()

{
   this.taste="sweet n sour";
   return this.taste;
}

}
