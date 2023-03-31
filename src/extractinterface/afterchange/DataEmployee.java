package extractinterface.afterchange;

public class DataEmployee {
    public double charge(Billable emp, int days) {
        int base = emp.getRate() * days;

        if (emp.hashSpecialSkill()) {
            return base * 1.05;
        }
        return base;
    }
}
