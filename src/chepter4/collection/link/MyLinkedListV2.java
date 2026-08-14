package chepter4.collection.link;

public class MyLinkedListV2 {

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

	// 추가 코드
	public void add(int index, Object item) {
		Node newNode = new Node(item);

		// 맨 앞에 추가하는 경우
		if (index == 0) {
			newNode.next = first;
			first = newNode;
		} else {
			Node prevNode = getNode(index - 1);
			newNode.next = prevNode.next; // 직전 node의 next를 새로 추가하는 node에 넣어서 새로 추가된 node의 다음 node랑 연결
			prevNode.next = newNode; // 이전 node의 next에 새로 추가된 node의 주소값 넣기
		}
		size++;

	}

	public Object set(int index, Object item) {
		Node x = getNode(index);
		Object oldValue = x.item; // 옛날 값 꺼내기
		x.item = item; // 인자로 받은 새 값 넣기
		return oldValue;
	}

	// 추가 코드
	public Object remove(int index) {
		Node removeNode = getNode(index);
		Object removedItem = removeNode.item;

		if (index == 0) {
			first = removeNode.next; // 첫 노드의 next(다음 노드)를 first(노드 시작 주소값)으로 설정
		} else {
			Node prevNode = getNode(index - 1);
			prevNode.next = removeNode.next;
		}

		removeNode.item = null;
		removeNode.next = null;

		size--;
		return removedItem;
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
