package Lab5.prob2;

import Lab5.prob2.impl.CanNotFly;
import Lab5.prob2.impl.FlyWithWings;
import Lab5.prob2.impl.Quack;
import Lab5.prob2.impl.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new CanNotFly();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }

}
