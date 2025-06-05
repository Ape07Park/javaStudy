package chepter2.construct;

public class MemberInit {

    String name;
    int age;
    int grade;
    
    // 기본 생성자
//    MemberInit() {}

    // 매개변수와 맴버변수의 이름이 같으면 구분을 위해 this를 넣는다.
    // 여기서 this는 참조값(주소값)을 의미한다
    // initMember 메소드 입장에선 매개변수가 맴버변수보다 가까워서 this가 없으면 매개변수를 먼저 찾는다
    void initMember(String name, int age, int grade) {
        this.name = name;
         this.age = age;
         this.grade = grade;
    }
}
