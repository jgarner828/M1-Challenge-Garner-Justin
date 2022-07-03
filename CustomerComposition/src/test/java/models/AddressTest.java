package models;

import org.junit.Assert;
import org.junit.Test;


public class AddressTest {


    @Test
    public void testingThatYouCanCreateANewAddress(){
        Address addressNoArguments = new Address();
        Address emptyIdenticalAddress = new Address();
        Assert.assertEquals(addressNoArguments, emptyIdenticalAddress);

        Address addressWithArgs = new Address(
                "999",
                "Yabaroonie Boulevard",
                "Atherton",
                "California",
                "94027"
        );

        Address identicalAddressWithArgs = new Address(
                "999",
                "Yabaroonie Boulevard",
                "Atherton",
                "California",
                "94027"
        );

        Assert.assertEquals(addressWithArgs, identicalAddressWithArgs);


    }

}