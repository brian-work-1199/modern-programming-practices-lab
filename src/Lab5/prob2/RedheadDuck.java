package Lab5.prob2;

import Lab5.prob2.impl.FlyWithWings;
import Lab5.prob2.impl.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }

}
