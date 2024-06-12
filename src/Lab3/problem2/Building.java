package Lab3.problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Double maintainentCost;
    private List<Apartment> apartments = new ArrayList<>();

    Building(double maintainentCost, double rent){
        addApartment(rent);
        this.maintainentCost = maintainentCost;
    }

    public void addApartment(double rent){
        Apartment apartment = new Apartment(rent);
        apartments.add(apartment);
    }

    public double calProfit(){
        Double profit = 0d;
        for(Apartment apartment : apartments){
            profit += apartment.getRent();
        }
        return profit - maintainentCost;
    }

}
