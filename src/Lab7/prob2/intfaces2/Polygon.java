package Lab7.prob2.intfaces2;

public interface Polygon extends ClosedCurve {
    Double[] getLengths();
    default public double computePerimeter() {
        double perimeter = 0;
        for(Double d: getLengths()){
            perimeter += d;
        }
        return perimeter;
    }

}
