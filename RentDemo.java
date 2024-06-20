package OOP_.Q4;

public class RentDemo {

    public static void main(String[] args) {


        // instances for each equipment
        Skis skis = new Skis(15.0, "2023-12-01");
        Boots boots = new Boots(10.0, "2023-12-01");
        Poles poles = new Poles(5.0, "2023-12-01");
        Helmet helmet = new Helmet(7.0, "2023-12-01");


        skis.askInfo();
        boots.askInfo();
        poles.askInfo();
        helmet.askInfo();


        RentPackage rentPackage = new RentPackage(skis, boots, poles, helmet);

        // Printing the rental package information
        System.out.println("\nRental Package Information:\n" + rentPackage);


        double totalCost = rentPackage.calculateTotalCost();
        System.out.println("Total Cost for the Rental Package: €" + totalCost);


    }


}



