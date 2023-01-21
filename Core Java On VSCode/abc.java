class Customer {
    int userId;
    String emailId;
    String password;
    String firstName;
    String city;
    String gender;
    long phoneNo;
    String lastName;
    Address ad;

    public Customer(int userId, String emailId, String password, String firstName, String city, String gender,
            long phoneNo, String lastName, Address ad) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.city = city;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.lastName = lastName;
        this.ad = ad;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }

    public void display(){
        System.out.println("Customer Info :");
        System.out.println("User Id :" +userId);
        System.out.println("Email Id :" +emailId);
        System.out.println("Password :" +password);
        System.out.println("FirstName :" +firstName);
        System.out.println("City :" +city);
        System.out.println("Gender :" +gender);
        System.out.println("Phone No :" +phoneNo);
        System.out.println("Last Name :" +lastName);
        System.out.println("===========================================");
        ad.display();
    }
}

class Address {

    String city;
    String state;
    int zip;
    String country;

    public Address(String city, String state, int zip, String country) {
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

   
    public void display(){
        System.out.println("Address Info :");
        System.out.println("City :" +city);
        System.out.println("State :" +state);
        System.out.println("Zip :" +zip);
        System.out.println("country :" +country);
    }


}

class Admin{
    
}

public class abc {
    public static void main(String[] args) {
        Address ad = new Address("Chandwad", "Maharashtra", 423101, "India");
        Customer c = new Customer(101, "abc@gmail.com", "abc@123", "abc", "chandwad", "Male", 1234567890, "xyz", ad);

        c.display();
    }
}
