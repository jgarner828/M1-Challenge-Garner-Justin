package app;

import models.Address;
import models.Customer;

public class Main {
    public static void main(String[] args) {

//        TODO Create a new customer. Add all details to new customer with fullargs constructor.


//        Billing information.
    Address billing = new Address("100", "Mulbary Street", "Atlanta", "Georgia", "30305");
//    Shipping information.
    Address shipping = new Address("999", "Yabaroonie Boulevard", "Atherton", "California", "94027");

        Customer jg = new Customer(
                "Justin",
                "Garner",
                "j.garner828@gmail.com",
                "7706784004",
                billing,
                shipping,
                true
        );

        System.out.println(jg);



    }
}
