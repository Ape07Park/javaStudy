package chepter2.final1;

public class ConstructInit {

    final int value;

    // 생성자를 통해 값을 할당받고 이후엔 변경 불가. 즉 처음 생성 시에만 원하는 값을 넣을 수 있고 그 이후엔 불가
    public ConstructInit(int value) {
        this.value = value;
    }


}
