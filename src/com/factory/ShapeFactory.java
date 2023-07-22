package com.factory;

public class ShapeFactory {
       
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		
		return null; 
	}
}
