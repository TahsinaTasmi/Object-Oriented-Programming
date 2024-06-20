package OOP_.Q4;

import java.util.Scanner;

public class Skis extends Rental {
    private int length;
    private String mark;

    public Skis(double pricePerDay, String rentingDay) {
        super(pricePerDay, rentingDay);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void askInfo() {
        super.askInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of skis (cm): ");
        length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the mark of skis: ");
        mark = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "Skis Information\nLength: " + length + "\nMark: " + mark + "\n";

    }


}



