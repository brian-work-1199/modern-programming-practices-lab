package Lab5.prob2.impl;

import Lab5.prob2.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
