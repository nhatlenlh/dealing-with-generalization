package pushdownmethod.afterchange;

public class Engineer extends Employee{
    @Override
    protected float AddSalary(float multiplier, float standardSalary) {
        return super.AddSalary(multiplier, standardSalary);
    }

    @Override
    protected float GetBonusSalary(float workingMonth, float dayOff) {
        return super.GetBonusSalary(workingMonth, dayOff);
    }
    protected int FeedbackFromEngineer(int score){
        return GetScoreFeedback(score) + 10;
    }

    private int GetScoreFeedback(int score){
        return score*10;

    }
}
