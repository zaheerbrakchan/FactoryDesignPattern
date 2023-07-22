package com.factory;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapeObj = shapeFactory.getShape("circle");
		System.out.println(shapeObj.draw());

	}

}
