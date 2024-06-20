package OOP_.Q3;

import java.util.ArrayList;
import java.util.List;

public class WarrantyUtils implements WarrantyService {
    private List<Warranty> warranties;

    public WarrantyUtils() {
        this.warranties = new ArrayList<>();
    }

    @Override
    public void addWarranty(Warranty warranty) {
        warranties.add(warranty);
    }

    @Override
    public String getProductWarrantyIssues(Warranty warranty) {
        return warranty.toString();
    }

    @Override
    public String getAllWarrantyIssues() {
        StringBuilder result = new StringBuilder();
        for (Warranty warranty : warranties) {
            result.append(warranty.toString()).append("\n");
        }
        return result.toString();
    }

    @Override
    public List<Warranty> getAllWarranties() {
        return warranties;

    }

}
