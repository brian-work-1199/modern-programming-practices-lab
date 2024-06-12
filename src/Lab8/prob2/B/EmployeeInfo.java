package Lab8.prob2.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	
	public void sort(List<Employee> emps) {
		Collections.sort(emps, (e1,e2) -> {
			int compareResult = e1.name.compareTo(e2.name);
			if(compareResult == 0){
				if(e1.salary == e2.salary) return 0;
				else if(e1.salary < e2.salary) return -1;
				else return 1;
			}
			return compareResult;
		});
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 10000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps);
		System.out.println(emps);
	}
}
