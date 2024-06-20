package OOP_.Q4;

import java.util.Scanner;

public class Boots extends Rental {
    private int size;
    private double stiffness;

    public Boots(double pricePerDay, String rentingDay) {
        super(pricePerDay, rentingDay);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getStiffness() {
        return stiffness;
    }

    public void setStiffness(double stiffness) {
        this.stiffness = stiffness;
    }

    @Override
    public void askInfo() {
        super.askInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of boots: ");
        size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the stiffness of boots: ");
        stiffness = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Boots Information\nSize: " + size + "\nStiffness: " + stiffness + "\n";

    }


}



