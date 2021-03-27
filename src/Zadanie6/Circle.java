package Zadanie6;

public class Circle implements GeometricObject {

    double r;
    public Circle(double r){
        this.r =r;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI *2*r;
    }

    


}
