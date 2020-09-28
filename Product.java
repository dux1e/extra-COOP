
/**
 * Write a description of class Product here.
 *
 * @Joakim Christensen
 * @29-09-2020
 */
public class Product
{
    // Instance variables
    private int id;
    private String description;
    private double price;
    private int amountOnStock;
    
    // Constructors
    public Product(int newId, String newDescription, double newPrice, int newStock) {
        id = newId;
        description = newDescription;
        price = newPrice;
        amountOnStock = newStock;
    }
    
    // Mutator methods
    // Accessor methods
    public void getProductDetail() {
        System.out.println("-----------------------");
        System.out.println("| Product description |");
        System.out.println("-----------------------");
        System.out.println("Product id: " + id);
        System.out.println("Product descriptopn: " + description);
        System.out.println("Product price: " + price);
        System.out.println("Product stock: " + amountOnStock);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
        
}
