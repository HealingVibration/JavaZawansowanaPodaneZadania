package Zadanie3;

public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle() {
        super("unknown", false);
        this.width = 1;
        this.length = 1;
    }


    public Rectangle(String color, boolean fillFigure, double width, double length) {
        super(color, fillFigure);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        double area = width * length;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (width*2) + (length*2);
        return  perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle with " +
                "width=" + width +
                " and length=" + length;
    }
}
