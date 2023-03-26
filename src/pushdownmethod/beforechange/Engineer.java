package pushdownmethod.beforechange;


public class Engineer extends Employee {
    @Override
    protected float AddSalary(float multiplier, float standardSalary) {
        return AddSalary(multiplier, standardSalary);
    }

    @Override
    protected float GetBonusSalary(float workingMonth, float dayOff) {
        return GetBonusSalary(workingMonth, dayOff);
    }



    protected int FeedbackFromEngineer(int score){
        return GetScoreFeedback(score) + 10;
    }



}
