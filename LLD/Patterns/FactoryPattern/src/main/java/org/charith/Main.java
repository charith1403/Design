package org.charith;

import Factory.ShapeFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeFactory shapeFactory2 = new ShapeFactory("rectangle");

    }
}