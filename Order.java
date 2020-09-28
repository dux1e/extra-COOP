
/**
 * Write a description of class Order here.
 *
 * @Joakim Christensen
 * @29-09-2020
 */
public class Order
{
    // Instance variables
    private int number;
    private String orderDate;
    private String delivery;
    private String payDate;
    private boolean status;
    private OrderLine myOrderLine;//at the moment only one order line pr. order
    
    // Constructors
    public Order(int newNr, String dato, String newDelivery) {
        number = newNr;
        orderDate = dato;
        delivery = newDelivery;
        status = false;
    }
    
    // Mutator methods
    public void setOrderLine(OrderLine newOrderLine) {
        myOrderLine = newOrderLine;
    }
    
    // Accessor methods
    public void getOrderDetail() {
        System.out.println("-----------------------");
        System.out.println("|  Order description  |");
        System.out.println("-----------------------");
        System.out.println("Number of orders ordered: " + number);
        System.out.println("The date of the order: " + orderDate);
        System.out.println("The day requested for delivery: " + delivery);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
    }
}
