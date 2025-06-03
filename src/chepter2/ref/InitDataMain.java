package chepter2.ref;

public class InitDataMain {

    public static void main(String[] args) {
        InitData data = new InitData(); // new로 해주는 것은 다 맴버변수는 초기화가 됨
        System.out.println(data.value1); // 0
        System.out.println(data.value2); // 10
    }
}
