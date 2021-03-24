package Zadanie5;




public class Line {
   public Point2D beginLine;
   public Point2D endLine;

    public Line(Point2D beginLine, Point2D endLine){
        this.beginLine = beginLine;
        this.endLine = endLine;
    }

    public Line(float x1, float y1, float x2, float y2){
        this.beginLine.setX(x1);
        this.beginLine.setY(y1);
        this.endLine.setX(x2);
        this.endLine.setY(y2);
    }

    public Point2D getBeginLine() {
        return beginLine;
    }

    public void setBeginLine(Point2D beginLine) {
        this.beginLine = beginLine;
    }

    public Point2D getEndLine() {
        return endLine;
    }

    public void setEndLine(Point2D endLine) {
        this.endLine = endLine;
    }



    public double length(Point2D beginLine, Point2D endLine){
        double score;
        score = Math.sqrt(Math.pow(((double) endLine.getX() - (double) beginLine.getX()), 2) + Math.pow((double) endLine.getY() - (double) beginLine.getY(), 2));
        System.out.println(score);
        return score;
    }


    public Point2D center(Point2D beginLine, Point2D endLine){
        float xCenter = (beginLine.getX() + endLine.getX())/2;
        float yCenter = (beginLine.getY() + endLine.getY())/2;


        return new Point2D(xCenter, yCenter);

    }


}
