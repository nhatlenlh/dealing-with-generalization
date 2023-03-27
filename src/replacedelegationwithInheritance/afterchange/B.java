package replacedelegationwithInheritance.afterchange;

public class B extends A{
    public void bar(){
        System.out.println("bar");
        foo();
    }
}
