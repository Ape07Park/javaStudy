package chepter4.collection.link;

public class MyLinkedListV1 {

	private Node first;
	private int size = 0;

	public void add(Object item) {
		Node newNode = new Node(item);

		if (first == null) {
			first = newNode;
		} else {
			Node lastNode = getLastNode();
			lastNode.next = newNode; // 마지막 노드의 참조값에 새 노드 넣기
		}
		size++;

	}

	private Node getLastNode() {
		Node x = first;

		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	public Object set(int index, Object item) {
		Node x = getNode(index);
		Object oldValue = x.item; // 옛날 값 꺼내기
		x.item = item; // 인자로 받은 새 값 넣기
		return oldValue;
	}

	public Object get(int index) {
		Node node = getNode(index);
		return node.item;
	}

	private Node getNode(int index) {
		Node x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public int indexOf(Object item) {

		int index = 0;

		for (Node x = first; x != null; x = x.next) {
			if (item.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1{" +
			"first=" + first +
			", size=" + size +
			'}';
	}
}
