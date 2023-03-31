package pushdownfield.beforechange;

public class Employee {
    public String name;
    public int ID;
    public String score;
    public String getScore() {
        return score;
    }
    private void setScore(String score) {
        this.score = score;
    }
}
