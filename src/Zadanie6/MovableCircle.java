package Zadanie6;

public class MovableCircle implements Movable {
    MovablePoint movablePoint;
    float r;


    public MovableCircle(MovablePoint movablePoint){
        this.movablePoint = movablePoint;
    }
    @Override
    public void moveUp() {
        movablePoint.setY(movablePoint.getY() + movablePoint.getySpeed());
    }


    @Override
    public void moveDown() {
        movablePoint.setY(movablePoint.getY() - movablePoint.getySpeed());
    }

    @Override
    public void moveRight() {
        movablePoint.setX(movablePoint.getX() + movablePoint.getxSpeed());
    }

    @Override
    public void moveLeft() {
        movablePoint.setX(movablePoint.getX() - movablePoint.getxSpeed());
    }
}
