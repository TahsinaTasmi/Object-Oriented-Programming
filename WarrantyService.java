package OOP_.Q3;


import java.util.List;

public interface WarrantyService {
    void addWarranty(Warranty warranty);

    String getProductWarrantyIssues(Warranty warranty);

    String getAllWarrantyIssues();

    List<Warranty> getAllWarranties();

}

