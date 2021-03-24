package Zadanie5;


public class Point2D {
    //Zad1

    float x;
    float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {

        float[] tab = new float[2];
        tab[0] = x;
        tab[1] = y;
        return tab;

    }

    public void print(float... array) {
        for (int i = 0; array.length > i; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString() {
        return "(" + x + " " + y + ")";

    }
}
