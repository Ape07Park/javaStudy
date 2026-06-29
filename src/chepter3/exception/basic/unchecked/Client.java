package chepter3.exception.basic.unchecked;


public class Client {

    public void call() {

        throw new MyUnCheckedException("ex"); // 예외 터지면 호출한 곳으로 나감. 따라서 터진 곳에서 처리하거나 밖에서 처리하거나
    }
}
