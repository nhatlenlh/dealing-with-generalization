package extractinterface.afterchange;

public class Employee implements Billable {
    private String name;

    private int rate;

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public boolean hashSpecialSkill() {
        return true;
    }
}
