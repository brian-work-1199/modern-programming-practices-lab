package Lab4.PartE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accountList = new ArrayList<>();

    Employee(String name){
        this.name = name;
    }
    public double computeUpdatedBalanceSum() {
        double balanceSumAccount = 0;
        for(Account account: accountList){
            balanceSumAccount += account.computeUpdateBalance();
        }
        //implement
        return balanceSumAccount;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }
}
