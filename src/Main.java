
import Zadanie5.Line;
import Zadanie5.Point2D;
import Zadanie5.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(150, 700);
        Point2D point2D2 = new Point2D(83, 72);
        Point3D point3D = new Point3D(28,2891,29938);

        point2D.print(point2D.getXY());
        System.out.println(point2D.toString());
        point3D.print(point3D.getXYZ());
        System.out.println(point3D.toString());

        Line line = new Line(point2D,point2D2);
        line.length(point2D, point2D2);

        Point2D pointCenter = line.center(point2D,point2D2);
        System.out.println(pointCenter.toString());


    }

}
