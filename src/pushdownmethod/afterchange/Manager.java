package pushdownmethod.afterchange;



public class Manager extends Employee {
    @Override
    protected float AddSalary(float multiplier, float standardSalary) {
        return super.AddSalary(multiplier, standardSalary);
    }

    @Override
    protected float GetBonusSalary(float workingMonth, float dayOff) {
        return super.GetBonusSalary(workingMonth, dayOff);
    }
}
