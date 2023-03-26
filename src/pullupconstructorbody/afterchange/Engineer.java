package pullupconstructorbody.afterchange;


public class Engineer extends Employee {
    public String Degree;
    public Engineer(String name, String id, String degree){
        super(name, id);
        Degree = degree;
    }
}
