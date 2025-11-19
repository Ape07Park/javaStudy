package jungsuckbook.exception.trywithresource;

public class TryWithResourceEx {

	public static void main(String[] args) {

		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(false);// 예외 발생 x
		} catch (CloseableResource.WorkException e) {
			e.printStackTrace();
		} catch (CloseableResource.CloseException e) {
			e.printStackTrace();
		}
		
		System.out.println();

		// 예외가 2개가 동시에 발생 불가 따라서 실제 발생한 WorkException을 예외로 내보내고 다음에 발생한 예외-CloseException-는 Suppressed(엑제된) 예외로 들어감
		try (CloseableResource cr = new CloseableResource()){
			cr.exceptionWork(true); // 예외 발생 O
		} catch (CloseableResource.WorkException e) {
			e.printStackTrace();
		} catch (CloseableResource.CloseException e) {
			e.printStackTrace();
		}
	}
}

class CloseableResource implements AutoCloseable {

	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork("+ exception + ") 호출");

		if (exception) {
			throw new WorkException("WorkException 발생!!");
		}
	}

	@Override
	public void close() throws CloseException {
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException 발생!!");
	}

	class WorkException extends Exception {
		WorkException(String message) {
			super(message);
		}
	}

	class CloseException extends Exception {
		CloseException(String message) {
			super(message);
		}
	}
}
