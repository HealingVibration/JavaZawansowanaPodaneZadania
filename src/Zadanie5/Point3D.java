package Zadanie5;
public class Point3D extends Point2D {

    private float z;



    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] tab = new float[3];
        tab[0] = x;
        tab[1] = y;
        tab[2] = z;
        return tab;
    }

    public void setXYZ(float x, float y, float z){

        super.x = x;
        super.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                "," + z +
                ")";
    }
}
