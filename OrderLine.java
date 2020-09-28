
/**
 * Write a description of class OrderLine here.
 *
 * @Joakim Christensen
 * @29-09-2020
 */
public class OrderLine
{
    // Instance variables
    private int amount;
    private Order order;//is connected to one order
    private Product product;// is connected to one product
    
    // Constructors
    public OrderLine(int newAmount, Order newOrder, Product newProduct) {
        amount = newAmount;
        order = newOrder;
        product = newProduct;
    }
    
    // Mutator methods
    // Accessor methods
    public void getOrderLineDetail() {
        product.getProductDetail();
        order.getOrderDetail();
        System.out.println("The total price of the order is");
        System.out.println("-------------------------------");        
        System.out.println(getOrderPrice() + " Kr,-");
    }
    
    public double getOrderPrice() {
        // double newPrice = product.getPrice();
        return amount * product.getPrice();
    }
}
