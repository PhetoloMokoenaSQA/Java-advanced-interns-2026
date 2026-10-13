package Chapter8;

/**
 * Project: Java-Advanced
 * Date  : 10/13/2026
 *
 * @author: Phetolo Mokoena
 * <ol>
 *     <li>
 *         A Product description should be at least 5 characters long
 *     </li>
 *     <li>
 *         Price cannot be negative or zero
 *     </li>
 *     <li>
 *         Quantity to sell cannot be more than quantity in stock
 *     </li>
 *     <li>
 *         Price Increase should be less than R10
 *     </li>
 *
 * </ol>
 */
public class Product {
    private String code, description;
    private double price;
    private int QtyInStock;


    public Product(String code, String description, double price, int qtyInStock) {
        setDescription(code);
        setCode(code);
        setPrice(price);
        setQtyInStock(qtyInStock);


    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    /**
     *
     * Set the description of the product
     * @param description Product Description
     * @throws IllegalArgumentException When a product description is less than 5 characters
     */
    public void setDescription(String description) throws IllegalArgumentException {

        if (description.length() < 5){
            throw new IllegalArgumentException("Decription Should be at least 5 characters long. " + "\nCurrent Description: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return QtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        QtyInStock = qtyInStock;
    }

    /**
     * Sells the product by subtracting the requested quantity from the current in stock
     * @param QtyToSell Requested quantity to sell
     * @throws LowStockException when the requested quantity is more than the available Quantity in stock
     */
    public void sell(int QtyToSell) throws  LowStockException{
        if (QtyInStock <= QtyToSell){
            throw new LowStockException("Quantity of stock is low" );
        }
        this.QtyInStock -= QtyToSell ;
    }

    /**
     * Incraese the product price by a percanetsge
     * @param percentage Percentage to increase the price by
     * @throws HighPriceIncreaseException when the price increase is more or equal to 10
     */
    public void increasePrice(double percentage) throws HighPriceIncreaseException{
        double increase = this.price * (percentage / 10);
        if(increase >= 10){
            throw new HighPriceIncreaseException("The price increase on " + getDescription() + "Is too high abuti"
            + increase + " Increase should be less than 10");
        }
        this.price += increase;
    }

    @Override
    public String toString(){
        return String.format("""
                =======Product Details for %s [%s]=======
                Code        :   %s
                Description :   %s
                Price       :   %2.f
                Qty In stock:   %d
                """,getDescription(),getCode(), getCode(), getDescription(),getPrice(),getQtyInStock());
    }
}
