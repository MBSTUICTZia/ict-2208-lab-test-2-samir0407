package com.mycompany.assesment;

public class ShapeMain {
    public static void main(String[] args) {
     
        Shape rectangle = new Rectangle("Red", true, 7.0, 8.0);
        Shape circle = new Circle("Blue", false, 9.0);

        
        System.out.println(rectangle);
        System.out.println();

      
        System.out.println(circle);
        System.out.println();

      
        System.out.println("Downcast Check");
        if (rectangle instanceof Rectangle) {
            Rectangle r = (Rectangle) rectangle;
            System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
        }
        if (circle instanceof Circle) {
            Circle c = (Circle) circle;
            System.out.println("Circle radius=" + c.getRadius());
        }
    }
}
