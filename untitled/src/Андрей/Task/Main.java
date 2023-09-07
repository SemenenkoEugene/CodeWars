package Андрей.Task;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Ivan", new Address("Volgograd", "34"));
        Student student3 = new Student("Maria", null);

        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
    }

    public static void printStudentInfo(Student student) {
        System.out.print("Student name: " + student.getName());
        student.getAddress().ifPresent(address -> System.out.println(", Address: " + address.getCity() + ", " + address.getRegion()));
        System.out.println();
    }
}
