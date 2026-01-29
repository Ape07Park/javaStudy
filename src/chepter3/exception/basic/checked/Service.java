package chepter3.exception.basic.checked;

/**
 * checked 예외는 예외를 잡아서 처리하거나 던지거나 해야함
 */
public class Service {
	Client client = new Client();

	/**
	 * 예외 처리 코드
	 */
	public void callCatch() {
		try {
			client.call();
		} catch (MyCheckedException e) {
			e.printStackTrace();
			System.out.println("예외처리 메시지 : " + e.getMessage());

		}
		System.out.println("정상 흐름");
	}

	/**
	 * 예외 던지는 코드
	 * 예외 던질려면 throws 키워드 필요
	 * @throws MyCheckedException
	 */
	public void callThrow() throws MyCheckedException {
		client.call();
	}
}
