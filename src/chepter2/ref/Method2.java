package chepter2.ref;

public class Method2 {

    public static void main(String[] args) {

        Student studentA =  createStudent( "학생A", 10, 90);
        Student studentB  = createStudent( "학생B", 15, 95);

        printStudent(studentA);
        printStudent(studentB);

    }

    public static Student createStudent(String name, int age, int grade) {

        Student student = new Student();

        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    public static void printStudent(Student student) {
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }
}
