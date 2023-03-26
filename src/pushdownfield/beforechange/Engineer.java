package pushdownfield.beforechange;

public class Engineer extends Employee{
    public String getEngineerScore(){
        return score + 5;
    }
    public void print(){
        System.out.println("This  Engineer class and this class use grade properties");
    }

}
