package chepter2.class1;

public class ClassStart3 {

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

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
