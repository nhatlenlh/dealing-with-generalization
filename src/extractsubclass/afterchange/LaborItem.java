package extractsubclass.afterchange;

public class LaborItem extends JobItem {
    private Employee employee;

    public LaborItem(int unitPrice, int quantity, Employee employee) {
        super(unitPrice, quantity);
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public int getUnitPrice() {
        return employee.getRate();
    }

    @Override
    protected boolean isLabor() {
        return true;
    }
}

