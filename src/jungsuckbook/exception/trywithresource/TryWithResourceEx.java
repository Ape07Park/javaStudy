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
