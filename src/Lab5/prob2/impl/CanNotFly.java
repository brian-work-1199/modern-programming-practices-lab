package Lab5.prob2.impl;

import Lab5.prob2.behavior.FlyBehavior;

public class CanNotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
