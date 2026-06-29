package chepter3.exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
