package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 * Thrown when there is a high price increase on a {@code  Product}
 */
public class HighPriceIncreaseException extends Exception {
    public HighPriceIncreaseException(String message){
        super(message);
    }
}
