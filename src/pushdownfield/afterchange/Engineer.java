package pushdownfield.afterchange;

public class Engineer extends Employee {

    public String score;
    public String getScore() {
        return score;
    }
    private void setScore(String score) {
        this.score = score;
    }
    public String GetEngineerScore(){
        return score + 5;
    }
    public void print(){
        System.out.println("This  Engineer class and this class use grade properties");
    }

}
