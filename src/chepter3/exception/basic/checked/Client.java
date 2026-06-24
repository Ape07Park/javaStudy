package chepter3.exception.basic.checked;

import jungsuckbook.exception.myexception.MyException;

public class Client {

    public void call() throws MyCheckedException {

        throw new MyCheckedException("ex");
    }
}
