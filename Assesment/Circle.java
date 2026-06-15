package com.mycompany.assesment;

class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" +
               "Color : " + color + "\n" +
               "Filled: " + (filled ? "Yes" : "No") + "\n" +
               "Radius: " + String.format("%.2f", radius) + "\n" +
               "Area         : " + String.format("%.2f", getArea()) + "\n" +
               "Circumference: " + String.format("%.2f", getPerimeter());
    }

    public double getRadius() {
        return radius;
    }
}
