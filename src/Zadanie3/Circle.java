package Zadanie3;

public class Circle extends Shape {
    double r;

    public Circle(){
        super("unknown", false);
        this.r = 1;
    }

    public Circle(String color, boolean fillFigure, float r) {
        super(color, fillFigure);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double getArea(){
        double area;
        area = Math.PI*r*r;
       return area;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter = 2*Math.PI*r;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + r + "which is a subclass off" + super.toString();
    }
}
