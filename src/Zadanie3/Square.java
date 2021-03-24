package Zadanie3;

public class Square extends Rectangle {
    Rectangle square;

    public Square(Rectangle square, double width){
        this.square = square;
        this.square.setLength(width);
        this.square.setWidth(width);

    }

    @Override
    public String toString() {
        return "Square{" +
                "square=" + square +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
