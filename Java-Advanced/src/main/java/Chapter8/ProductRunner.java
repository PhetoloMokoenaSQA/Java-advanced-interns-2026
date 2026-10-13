package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 */
public class ProductRunner {
    static void main(String[] args) {

        try {
            Product p = new Product("code123", "microwave", 8, 500);
            p.increasePrice(1);
            p.sell(8);
            System.out.println(p);
        } catch (IllegalArgumentException | LowStockException | HighPriceIncreaseException ex) {
            System.err.println(ex.getMessage());
        }
    }
}