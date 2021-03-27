package Zadanie6;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double r){
        super(r);
    }

    @Override
    public void resize(int percent) {
       r = r * (double) percent;
        System.out.println(r);
    }
}
