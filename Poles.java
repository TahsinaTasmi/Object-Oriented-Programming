package OOP_.Q4;

import java.util.Scanner;

public class Poles extends Rental {
    private int length;

    public Poles(double pricePerDay, String rentingDay) {
        super(pricePerDay, rentingDay);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void askInfo() {
        super.askInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of poles (cm): ");
        length = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Poles Information\nLength: " + length + "\n";
    }


}







