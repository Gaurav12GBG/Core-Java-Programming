import java.util.*;

class Product {
    private long id;
    private String productName;
    private String supplierName;

    public Product() {
    }

    public Product(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    };

    public void display() {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }

}

public class ProductSupplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1[] = new String[2];

        System.out.println("Enter the product id");
        s1[0] = sc.nextLine();
        System.out.println("Enter the product name");
        s1[1] = sc.nextLine();
        System.out.println("Is the product supplied by Nivas Suppliers? Type yes or no (not case sensitive)");
        String response = sc.nextLine();

        int id = Integer.parseInt(s1[0]);
        String productName = s1[1];
        
        if (response.toLowerCase().equals("yes")) {
            Product p1 = new Product(id, productName, "Nivas");
            p1.display();
        } else {
            System.out.println("Enter the supplier name");
            String supplierName = sc.nextLine();
            Product p2 = new Product(id, productName, supplierName);
            p2.display();
        }

        sc.close();
    }
}
