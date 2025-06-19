package chepter2.final1;

public class FinalRefMain {

    public static void main(String[] args) {

        // 주소값이 고정됨
        final Data data = new Data();
//        data = new Data();

        data.value = 10; // 주소값을 담은 data-참조형 변수-가 final인 거지 Data 필드가 final인 것이 아님
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
