package OOP_.Q4;

import java.util.Scanner;

public class Rental {
    private double pricePerDay;
    private String rentingDay;

    public Rental(double pricePerDay, String rentingDay) {
        this.pricePerDay = pricePerDay;
        this.rentingDay = rentingDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getRentingDay() {
        return rentingDay;
    }

    public void setRentingDay(String rentingDay) {
        this.rentingDay = rentingDay;
    }

    public void askInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price per day: ");
        pricePerDay = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the renting day: ");
        rentingDay = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Price per Day: " + pricePerDay + "\nRenting Day: " + rentingDay + "\n";
    }


}






