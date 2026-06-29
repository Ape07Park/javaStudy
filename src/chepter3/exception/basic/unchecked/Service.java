package chepter3.exception.basic.unchecked;

import chepter3.exception.basic.checked.MyCheckedException;

/**
 *  Unchecked 예외는
 *  예외를 잡거나 던지지 않아도 됨
 *  예외를 잡지 않으면 자동으로 밖으로 던짐.
 */
public class Service {

    Client client = new Client();

    /**
     * 예외 잡아서 처리하는 코드
     */
    public void callCatch()  {

        try {

            client.call();
        } catch( MyUnCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어감
     * 체크 예외와 달리 throws 예외 선언 안해도 됨
     * @throws MyCheckedException
     */
    public void catchThrow() {
        client.call();
    }
}
