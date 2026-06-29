package chepter3.exception.basic.unchecked;

/**
 * RuntimeException 을 상속받은 예외는 unchecked 예외가 된다
 */
public class MyUnCheckedException extends RuntimeException{

    public MyUnCheckedException(String message) {
        super(message);
    }
}
