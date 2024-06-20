package OOP_.Q4;

import java.util.Scanner;

public class Helmet extends Rental {
    private int size;
    private String color;

    public Helmet(double pricePerDay, String rentingDay) {
        super(pricePerDay, rentingDay);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void askInfo() {
        super.askInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of helmet: ");
        size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the color of helmet: ");
        color = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Helmet Information\nSize: " + size + "\nColor: " + color + "\n";
    }


}
