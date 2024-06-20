package OOP_.Q3;

import java.util.List;
public class WarrantyDemo {

    public static void main(String[] args) {

        WarrantyService warrantyService = new WarrantyUtils();

        while (true) {
            Warranty warranty = Warranty.createWarrantyFromUserInput();
            if (warranty == null || warranty.getProductCode().equals("0")) {
                break;
            }

            warrantyService.addWarranty(warranty);
        }


        List<Warranty> allWarranties = warrantyService.getAllWarranties();
        if (!((List<?>) allWarranties).isEmpty()) {
            System.out.println("Product’s warranty info:");
            System.out.println(warrantyService.getProductWarrantyIssues(allWarranties.get(0)));
        }


        System.out.println("\nAll warranty infos:");
        System.out.println(warrantyService.getAllWarrantyIssues());

    }

}