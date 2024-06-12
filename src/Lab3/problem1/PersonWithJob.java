package Lab3.problem1;

public class PersonWithJob {

	//compose Person in PersonWithJob
	private Person person;
	private double salary;
	public String getName() {
		return person.getName();
	}
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false;
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}

	public static void main(String[] args) {
		PersonWithJob pwj1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		PersonWithJob pwj2 = new PersonWithJob("Joe", 30000);
		// Using composition
		System.out.println("pwj1.equals(p2)? " + pwj1.equals(p2)); // Should be false
		System.out.println("p2.equals(pwj1)? " + p2.equals(pwj1)); // Should be false
		System.out.println("pwj1.equals(pwj2)? " + pwj1.equals(pwj2)); // Should be true
	}
}
