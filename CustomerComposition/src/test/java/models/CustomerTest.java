package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CustomerTest {

    @Before

    @Test
    public void testingThatYouCanCreateANewCustomerWithBothConstructors(){

//        creating sample addresses for customer addresses
        Address billingAddress = new Address(
                "999",
                "Yabaroonie Boulevard",
                "Atherton",
                "California",
                "94027"
        );

        Address shippingAddress = new Address(
                "111",
                "Habalabalabaoo Avenue",
                "Atherton",
                "California",
                "94027"
        );


//creating a sample customer
        Customer jg = new Customer(
                "Justin",
                "Garner",
                "j.garner828@gmail.com",
                "7706784004",
                billingAddress,
                shippingAddress,
                true
                );

        Customer identicalCustomerasJG = new Customer(
                "Justin",
                "Garner",
                "j.garner828@gmail.com",
                "7706784004",
                billingAddress,
                shippingAddress,
                true
        );

//        test for args constructors
        Assert.assertEquals(jg, identicalCustomerasJG);


//test for noargs constructor.
        Customer newCustomer = new Customer();
        Customer emptyCustomer = new Customer();
        Assert.assertEquals(emptyCustomer, newCustomer);

    }

}