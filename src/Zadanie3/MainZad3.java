package Zadanie3;

public class MainZad3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Red", true, 7,8);
        System.out.println(rectangle.toString());

        Square square = new Square(rectangle, 3);
        System.out.println(square.toString());
    }
}
