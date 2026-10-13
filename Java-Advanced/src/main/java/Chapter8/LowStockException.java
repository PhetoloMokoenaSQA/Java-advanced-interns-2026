package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 * Exception thrown when a{@code Product} has a low quantity in stock
 */
public class LowStockException extends Exception{
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public LowStockException(String message) {
        super(message);
    }
}
