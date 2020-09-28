
/**
 * Write a description of class Customer here.
 *
 * @Joakim Christensen
 * @29-09-2020
 */
public class Customer
{
    // Instance variables
    private int number;
    private String address;
    private String phone;
    private Order myOrder;//at the moment only one instance of Order
    
    // Constructors
    public Customer(int newNr, String newAddress, String newPhone) {
        number = newNr;
        address = newAddress;
        phone = newPhone;
    }
    
    // Mutator methods
    public void setOrder(Order newOrder) {
        myOrder = newOrder;
    }
    
    // Accessor methods  
}
