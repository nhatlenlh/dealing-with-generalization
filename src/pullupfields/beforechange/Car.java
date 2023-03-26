package pullupfields.beforechange;

public class Car  extends Vehicle{

   private String name;
   private String age;
   private String fourWheel;

   public void printName(){
      name = "BMW";
      System.out.println(name);
   }

}
