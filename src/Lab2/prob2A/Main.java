package Lab2.prob2A;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ngoc Thinh Le");

        System.out.println("Student Name: " + student.getName());
        System.out.println("GradeReport's Student Name: " + student.getGradeReport().getStudent().getName());
    }
}
