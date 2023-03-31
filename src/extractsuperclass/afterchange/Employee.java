package extractsuperclass.afterchange;

public class Employee extends Party {
    private String id;

    private int annualCost;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }

    public String getId() {
        return id;
    }


    @Override
    public int getAnnualCost() {
        return annualCost;
    }
}
