package collections;

import java.util.Enumeration;
import java.util.Hashtable;


public class Hashtbl {
public static void main(String args[]) {
    Customer customer = new Customer("David", "Lee");
    Order order = new Order(12, "IBM", 500);
    Portfolio portfolio = new Portfolio(455);

    Hashtable data = new Hashtable();
    data.put("Customer",customer);
    data.put("Order",order);
    data.put("Portfolio",portfolio);

    System.out.println(data.size());

    Order myOrder = (Order)data.get("Order"); //casting

    System.out.println(myOrder.id);

    System.out.println(data.containsKey("Portfolio"));
    System.out.println(data.containsValue(portfolio));


    //use enumeration

    Enumeration datakeys = data.keys();
    Enumeration dataelements = data.elements();


    while (dataelements.hasMoreElements()){

        Object currentObj = dataelements.nextElement();
        System.out.println(currentObj.getClass());
    }

}
}
