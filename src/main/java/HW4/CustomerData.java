package HW4;


public class CustomerData {
    private String name;
    private String email;
    private String phoneNumber;

    public CustomerData(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public CustomerData() {
        this("", "", "");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
