package Lab4.PartE;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        double balanceSumEmployee = 0;
        for(Employee employee: list){
            balanceSumEmployee += employee.computeUpdatedBalanceSum();
        }
        //implement
        return balanceSumEmployee;
    }
}
