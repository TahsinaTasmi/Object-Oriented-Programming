package OOP_.Q5;

public class ProductDemo {

    public static void main(String[] args) {
        Canon cameras = new Canon();
        cameras.addProduct(new Product("Canon E300", "E23123", "Good digital", 450.0, true));


        Canon lights = new Canon();
        lights.addProduct(new Product("Canonn E400", "E23222", "Smart", 300, true));

        Genelec speakers = new Genelec();
        speakers.addProduct(new Product("Genelec G123", "G45678", "High-quality speakers", 1200.0, true));

        Genelec soundbox = new Genelec();
        soundbox.addProduct(new Product("Genelec T333", "T34444", "smart", 50 ,true));

        Genelec earphone = new Genelec();
        earphone.addProduct(new Product("Genelec T333", "T300044", "smart", 50 ,true));

        Genelec mouse = new Genelec();
        mouse.addProduct(new Product("Genelec T0003", "T34444", "smart", 50 ,true));


        printProductInformation(cameras);
        printProductInformation(speakers);
        printProductInformation(lights);
        printProductInformation(soundbox);
        printProductInformation(earphone);
        printProductInformation(mouse);


    }


    private static void printProductInformation(ProductInterface productInterface) {
        for (Product product : productInterface.getProductInformation()) {
            product.printProductData();
        }

    }



}


