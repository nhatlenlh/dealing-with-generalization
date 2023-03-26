package pushdownmethod.afterchange;

public abstract class Employee {
    protected float AddSalary(float multiplier, float standardSalary){
        return multiplier * standardSalary;
    }

    protected float GetBonusSalary(float workingMonth, float dayOff){
        return workingMonth * 70000 - dayOff*10000;
    }
}
