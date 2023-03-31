    package extractinterface.beforechange;

public class DataEmployee {
    public double charge(Employee emp, int days) {
        int base = emp.getRate() * days;

        if (emp.hashSpecialSkill()) {
            return base * 1.05;
        }
        return base;
    }
}
