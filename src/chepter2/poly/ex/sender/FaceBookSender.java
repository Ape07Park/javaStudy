package chepter2.poly.ex.sender;

public class FaceBookSender implements Sender{

	@Override
	public void sendMessage(String message) {
		System.out.println("페북에서 발송합니다: " + message);
	}
}
