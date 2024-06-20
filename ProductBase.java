package OOP_.Q5;

public abstract class ProductBase {
    private String productName;
    private String serialNumber;

    public ProductBase(String productName, String serialNumber) {
        this.productName = productName;
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public abstract void printProductData();


}

