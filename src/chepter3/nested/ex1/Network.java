package chepter3.nested.ex1;

public class Network {

    public void sendMessages(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
