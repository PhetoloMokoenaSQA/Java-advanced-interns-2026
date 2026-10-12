package Chapter7.Interfaces;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class MySquare extends MyShape implements IShapeCalculation , IGraphics{
   // private int side;

    public MySquare(int side) {
        super(side, 0);
       // this.side = side;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPeremeter() {
        return this.length*4;
    }

    @Override
    public void apply(String color) {
        System.out.println("Applying" + color + "color");
    }

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println("Side: " + this.length);
        System.out.println("Side: " + this.length);
    }
}
