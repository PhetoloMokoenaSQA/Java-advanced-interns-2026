package Chapter7.Interfaces;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class ShapeRunner {
    static void main(String[] args) {
        MySquare objSquare = new MySquare(5);
        objSquare.display();

        MyCircle objCircle = new MyCircle(7);
        objCircle.display();
        objCircle.draw();
        objCircle.apply("Red");
    }
}
