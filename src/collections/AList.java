package collections;

import java.util.*;

public class AList {
	
	public static void main(String args[]) {

	List custlist = new ArrayList();



        List<Customer> cust = new ArrayList<Customer>();
	
	Customer customer1 = new Customer("David","Lee");
	custlist.add(customer1);
	
	Customer customer2 = new Customer("Ringo", "Star");
	custlist.add(customer2);

	Customer customer3 = new Customer("David","Lee");
	custlist.add(customer3);

    Order order = new Order(123,"IBM",500);
    custlist.add(order);

        System.out.println(custlist.size());

        for(int i=0; i<custlist.size();i++){


            /*

            Customer currentCustomer = (Customer)custlist.get(i);
            currentCustomer.getClass();
            gives java.lang.ClassCastException: collections.Order cannot be cast to collections.Customer

            */

            Object currentObject = custlist.get(i);
            if(currentObject instanceof Customer){
                Customer currentCustomer = (Customer) custlist.get(i);
                System.out.println(currentCustomer.getClass());

            }
            else if(currentObject instanceof  Order){
                Order currentOrder = (Order) custlist.get(i);
                System.out.println(currentOrder.getClass());

            }




        }



	}
	
}
