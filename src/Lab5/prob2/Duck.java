package Lab5.prob2;

import Lab5.prob2.behavior.FlyBehavior;
import Lab5.prob2.behavior.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display(){
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }
}
