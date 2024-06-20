package OOP_.Q4;
public class RentPackage {
    private Skis skis;
    private Boots boots;
    private Poles poles;
    private Helmet helmet;

    public RentPackage(Skis skis, Boots boots, Poles poles, Helmet helmet) {
        this.skis = skis;
        this.boots = boots;
        this.poles = poles;
        this.helmet = helmet;
    }

    public double calculateTotalCost() {
        double totalCost = 0;

        totalCost += skis.getPricePerDay();
        totalCost += boots.getPricePerDay();
        totalCost += poles.getPricePerDay();
        totalCost += helmet.getPricePerDay();

        return totalCost;
    }

    @Override
    public String toString() {
        return skis.toString() + boots.toString() + poles.toString() + helmet.toString();
    }


}





