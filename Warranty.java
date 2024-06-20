package OOP_.Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Warranty {
    private String productCode;
    private String description;
    private String solution;
    private double cost;

    public Warranty(String productCode, String description, String solution, double cost) {
        this.productCode = productCode;
        this.description = description;
        this.solution = solution;
        this.cost = cost;
    }

    public String getProductCode() {
        return productCode;
    }

    public static Warranty createWarrantyFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product code of the device (0 = Stop Feeding): ");
        String productCode = scanner.nextLine();

        if (productCode.equals("0")) {
            return null;
        }

        System.out.print("Please provide a description of the problem: ");
        String description = scanner.nextLine();

        System.out.print("Enter the solution to the problem (if any): ");
        String solution = scanner.nextLine();

        double cost = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Please enter the cost of solving the problem (€): ");
                cost = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return new Warranty(productCode, description, solution, cost);
    }

    @Override
    public String toString() {
        return "Warranty code: " + productCode +
                ", Description: " + description +
                ", Solution: " + solution +
                ", Cost: €" + cost;
    }


}
