package chepter2.class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1;
        student1 = new Student(); // 학생 객체(인스턴스)를 실제 메모리에 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];

        students[0] = student1;
        students[1] = student2;

        System.out.println(students[0].name + " " + students[0].age + " " + students[0].grade);
        System.out.println(students[1].name + " " + students[1].age + " " + students[1].grade);
    }
}
