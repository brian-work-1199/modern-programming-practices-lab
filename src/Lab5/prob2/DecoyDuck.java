package Lab5.prob2;

import Lab5.prob2.impl.CanNotFly;
import Lab5.prob2.impl.FlyWithWings;
import Lab5.prob2.impl.MuteQuack;
import Lab5.prob2.impl.Quack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new CanNotFly();
    }
    @Override
    public void display() {
        System.out.println("displaying");
    }

}
