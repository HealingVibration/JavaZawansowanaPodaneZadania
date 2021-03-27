package Zadanie6;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0, 5, 5);
        MovableCircle circle = new MovableCircle(point);
        point.moveUp();
        point.moveLeft();
        point.moveLeft();
        point.moveDown();
        point.moveUp();
        point.moveRight();
        circle.moveUp();
        circle.moveLeft();
        point.print(point);

        Circle circleToResize = new Circle(5);
        ResizableCircle circleResize = new ResizableCircle(8);
      circleResize.resize(5);
        System.out.println(circleToResize.getR());


    }
}
