package Lab2.prob2A;

public class GradeReport {
	private String name;
	private Student student;
	
	GradeReport(Student student){
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GradeReport [name=" + name + ", student=" + student + "]";
	}
}
