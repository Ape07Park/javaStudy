package chepter2.final1;

public class FieldInit {

    // static + final이 붙은 걸 상수라고 부름
    // 값이 변하지 않는 공용 변수
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 초기값을 이미 필드에서 설정해서 생성자를 이용해 재할당 불가
//    public FieldInit(int value) {
//      this.value = value;
//    }
}
