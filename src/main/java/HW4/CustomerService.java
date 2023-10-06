package HW4;

public class CustomerService {

    public Customer getCustomer(String login, String password) {
        String str = login + password;
        int id = str.hashCode();
        CustomerData customerData = new CustomerData();
        Customer customer = new Customer(id, customerData);
        return customer;
    }
}
