package pushdownmethod.beforechange;

public class Employee {
    protected float AddSalary(float multiplier, float standardSalary){
        return multiplier * standardSalary;
    }

    protected float GetBonusSalary(float workingMonth, float dayOff){
        return workingMonth * 70000 - dayOff*10000;
    }


    //This function only use in Engineer class
    protected int GetScoreFeedback(int score){
        return score*10;

    }
}
