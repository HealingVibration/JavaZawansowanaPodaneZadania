public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(150, 700);
        Point3D point3D = new Point3D(28,2891,29938);


        point2D.print(point2D.getXY());
        System.out.println(point2D.toString());
        point3D.print(point3D.getXYZ());
        System.out.println(point3D.toString());


    }

}
