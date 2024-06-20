package Test;

public interface I {
    default void myMethod(int x){
        System.out.println(Math.pow(x, x));
    }
}
