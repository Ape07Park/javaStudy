package chepter3.exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {

        String address = "http://example.com";

        // client 변수는 try 안에서만 유효.
        // 또한 연결 은 try 안에서만 유효하기에 catch로 가거나
        // try에서 더 이상 실행할 것이 없다면 바로 자원 반납.
        // try 안에서만 자원 사용 가능하고 그 기간 동안만 생존
        try (NetworkClientV5 client = new NetworkClientV5(address)) {

            client.initError(data);
            client.connect();
            client.send(data);

        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }

    }

}
