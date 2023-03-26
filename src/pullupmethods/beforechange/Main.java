package pullupmethods.beforechange;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RedHeadDuck redHead = new RedHeadDuck();
        mallard.swim();
        mallard.display();
        redHead.swim();
        redHead.headColor();
    }
}
