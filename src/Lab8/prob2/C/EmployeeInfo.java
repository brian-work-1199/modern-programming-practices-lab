package Lab8.prob2.C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	
	public void sort(List<Employee> emps) {
		Collections.sort(emps, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
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
