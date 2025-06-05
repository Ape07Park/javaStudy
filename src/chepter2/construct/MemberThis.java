package chepter2.construct;

public class MemberThis {

    String nameField;

    // 매개변수와 맴버변수 이름이 달라서 O
    // 1) 먼저 name에 해당하는 것을 매개견수와 지역변수에서 찾음. 이유는 스코프가 더 가까워서
    // 2) 그 다음 nameField를 찾음. 매개변수, 지역변수에 없으면 맴버변수에서 찾음
    void initNameField(String name) {
        nameField = name; // this 생략함
    }
}
