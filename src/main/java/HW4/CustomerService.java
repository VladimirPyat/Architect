package HW4;

public class CustomerService {
    public Customer getCustomer(String login, String password) {
        Customer customer = new Customer(login, password);
        return customer;
    }
}
