package Lab5.prob2;

import Lab5.prob2.impl.FlyWithWings;
import Lab5.prob2.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("display");
    }
}
