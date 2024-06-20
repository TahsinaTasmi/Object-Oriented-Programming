package OOP_.Q5;

public class Product extends ProductBase {

    private String description;
    private double price;
    private boolean inStorage;

    public Product(String productName, String serialNumber, String description, double price, boolean inStorage) {
        super(productName, serialNumber);
        this.description = description;
        this.price = price;
        this.inStorage = inStorage;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStorage() {
        return inStorage;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStorage(boolean inStorage) {
        this.inStorage = inStorage;
    }


    @Override
    public void printProductData() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("In Storage: " + inStorage);
        System.out.println();
    }

}
