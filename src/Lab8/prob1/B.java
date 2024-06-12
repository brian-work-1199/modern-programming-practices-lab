package Lab8.prob1;

import java.util.function.Supplier;

/*
An example of a method reference is:
                                Math::random
Its corresponding functional interface is Supplier<Double>. Do the following:
i. Rewrite this method reference as a lambda expression
ii. Put this method expression in a main method in a Java class and use it to print a
random number to the console
iii. Create an equivalent Java class in which the functional behavior of Math::random is
expressed using an inner class (implementing Supplier); call this inner class from a
main method and use it to output a random number to the console. The behavior
should be the same as in part ii.
 */
public class B {
    public static void main(String[] args){
        //b.i and b.ii

        Supplier<Double> f = () -> Math.random();
        System.out.println(f.get());

        //b.iii
        class MySupplier implements Supplier<Double>{
            public Double get(){
                return Math.random();
            }
        }
        MySupplier mySupplier = new MySupplier();
        System.out.println(mySupplier.get());

    }
}
