package Chapter7.Interfaces;

/**
 * Project: Java-Advanced
 * Date  : 10/12/2026
 *
 * @author: Phetolo Mokoena
 */
public class MyShape  {
    protected double length, width ;

    public MyShape(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double calculateArea(){
        return this.length * this.width;
    }



}
