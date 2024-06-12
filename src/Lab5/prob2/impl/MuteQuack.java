package Lab5.prob2.impl;

import Lab5.prob2.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
