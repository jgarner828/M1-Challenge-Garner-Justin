package models;


import java.util.Objects;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address billingAddress;
    private Address shippingAddress;
    boolean isRewardsMember;

//    typical constuctor
    public Customer(String firstName, String lastName, String email, String phone, Address billingAddress, Address shippingAddress, boolean isRewardsMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.isRewardsMember = isRewardsMember;
    }

//   no args constructor.
    public Customer() {}




    //    getters, setters, hash, equals, and toString methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return isRewardsMember == customer.isRewardsMember && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(phone, customer.phone) && Objects.equals(billingAddress, customer.billingAddress) && Objects.equals(shippingAddress, customer.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, phone, billingAddress, shippingAddress, isRewardsMember);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", billingAddress=" + billingAddress +
                ", shippingAddress=" + shippingAddress +
                ", isRewardsMember=" + isRewardsMember +
                '}';
    }
}

