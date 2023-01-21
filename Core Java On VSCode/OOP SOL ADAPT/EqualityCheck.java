class Customer {
    int customerId;
    String name, city, phone, email;

    // Default constructor
    Customer() {

    }

    // Parametrized constructor
    Customer(int customerId, String name, String city, String phone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    // getters
    public int getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    // setters
    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override // Equals method
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Customer c = (Customer) obj;
        if (!getResult(this.name, c.getName()))
            return false;
        if (!getResult(this.city, c.getCity()))
            return false;
        if (!getResult(this.email, c.getEmail()))
            return false;
        if (!getResult(this.phone, c.getPhone()))
            return false;
        return this.customerId == c.getCustomerId();
    }

    private boolean getResult(String a, String b) {
        if (a == null && b != null)
            return false;
        else if (a != null && b == null)
            return false;
        else if (a != null && b != null)
            return a.equals(b);
        return true;
    }
}

class EqualityCheck {
    public static void main(String[] args) {
        // Parameterized Constructor
        Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
        Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

        // Equals
        c1.equals(c2); // --> should return true
        c2.equals(c1); // --> should return true

        // Setter and Equals
        c1.setEmail("vinod@mailinator.com");
        c1.equals(c2); // --> should return false
        c2.equals(c1); // --> should return false

        c2.setEmail("vinod@mailinator.com");
        c1.equals(c2); // --> should return true
        c2.equals(c1); // --> should return true

        // Default Constructor
        Customer c3 = new Customer();
        Customer c4 = new Customer();
        c3.equals(c4); // --> should return true
    }
}