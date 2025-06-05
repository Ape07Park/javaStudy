package chepter2.construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    /**
     * 생성자 오버로딩
     */

    // 내가 정의한 생성자 2
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 자신의 생성자를 호출 즉 생성자 1을 호출한다

//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // 내가 정의한 생성자 1
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + " age: " + age + " grade: " + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
