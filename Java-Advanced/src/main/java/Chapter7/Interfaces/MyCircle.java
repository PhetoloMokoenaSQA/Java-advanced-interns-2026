package Chapter7.Interfaces;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class MyCircle extends MyShape implements IGraphics, IShapeCalculation{
    private double sid;

    public MyCircle(double radius) {
       super(6,12);
    }

    @Override
    public void apply(String color) {

    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.width, 2);
    }

    @Override
    public double getPeremeter() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Radius: " + this.width);
        System.out.println("Area: " + getArea());
        System.out.println("=============================");
    }
}
