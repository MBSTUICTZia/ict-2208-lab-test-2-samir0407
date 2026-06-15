package com.mycompany.assesment;

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "[ Rectangle ]\n" +
               "Color : " + color + "\n" +
               "Filled: " + (filled ? "Yes" : "No") + "\n" +
               "Width : " + String.format("%.2f", width) + "\n" +
               "Length: " + String.format("%.2f", length) + "\n" +
               "Area      : " + String.format("%.2f", getArea()) + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter());
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
