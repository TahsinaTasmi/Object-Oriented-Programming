package OOP_.Q5;

import java.util.ArrayList;

public class Genelec implements ProductInterface {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product prod) {
        products.add(prod);
    }

    @Override
    public ArrayList<Product> getProductInformation() {
        return products;
    }

}
