package Zadanie3;

public abstract class Shape {

    protected String color;
    protected boolean fillFigure;

    public Shape(){
        this.color ="unknown";
        this.fillFigure = false;
    }

    public Shape(String color, boolean fillFigure) {
        this.color = color;
        this.fillFigure = fillFigure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillFigure() {
        return fillFigure;
    }

    public void setFillFigure(boolean fillFigure) {
        this.fillFigure = fillFigure;
    }


    @Override
    public String toString() {
        return "Shape with color of " + color +
                " " + fillFigure;
    }



}
