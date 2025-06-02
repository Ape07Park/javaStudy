package chepter2.ref;

public class Method1 {

    public static void main(String[] args) {

        Student studentA = new Student();
        Student studentB = new Student();

        initStudent(studentA, "학생A", 10, 90);
        initStudent(studentB, "학생B", 15, 95);

        printStudent(studentA);
        printStudent(studentB);

    }

    public static void initStudent(Student student, String name, int age, int grade) {

        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student student) {
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }
}
