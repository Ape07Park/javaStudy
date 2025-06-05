package chepter2.construct;

public class MemberDefault {

    String name;


    // 기본 생성자
//    public MemberDefault() {
//    }

    // 내가 정의한 생성자
    // 내가 정의한 생성자가 존재 시 자바는 기본 생성자를 자동으로 만들지 않음
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
