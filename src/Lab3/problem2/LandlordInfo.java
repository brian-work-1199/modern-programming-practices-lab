package Lab3.problem2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings = new ArrayList<>();
    //Result 7025
    public void addBuilding(double maintainentCost, double rent){
        Building building = new Building(maintainentCost, rent);
        buildings.add(building);
    }

    public double calcProfits(){
        Double profit = 0d;
        for(Building building: buildings){
            profit += building.calProfit();
        }
        return profit;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}
