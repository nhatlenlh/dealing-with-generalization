package replacedelegationwithInheritance.beforechange;



public class B {
    private final A a = new A();
    public void bar(){
        System.out.println("bar");
        a.foo();
    }
}
