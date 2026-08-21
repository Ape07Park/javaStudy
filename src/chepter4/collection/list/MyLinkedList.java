package chepter4.collection.list;

public class MyLinkedList<E> implements MyList<E> {

	private Node<E> first;
	private int size = 0;

	@Override
	public void add(E item) {
		Node<E> newNode = new Node<>(item);

		if (first == null) {
			first = newNode;
		} else {
			Node<E> lastNode = getLastNode();
			lastNode.next = newNode; // 마지막 노드의 참조값에 새 노드 넣기
		}
		size++;

	}

	private Node<E> getLastNode() {
		Node<E> x = first;

		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	// 추가 코드
	@Override
	public void add(int index, E item) {
		Node<E> newNode = new Node<>(item);

		// 맨 앞에 추가하는 경우
		if (index == 0) {
			newNode.next = first;
			first = newNode;
		} else {
			Node<E> prevNode = getNode(index - 1);
			newNode.next = prevNode.next; // 직전 node의 next를 새로 추가하는 node에 넣어서 새로 추가된 node의 다음 node랑 연결
			prevNode.next = newNode; // 이전 node의 next에 새로 추가된 node의 주소값 넣기
		}
		size++;

	}

	@Override
	public E set(int index, E item) {
		Node<E> x = getNode(index);
		E oldValue = x.item; // 옛날 값 꺼내기
		x.item = item; // 인자로 받은 새 값 넣기
		return oldValue;
	}

	// 추가 코드
	@Override
	public E remove(int index) {
		Node<E> removeNode = getNode(index);
		E removedItem = removeNode.item;

		if (index == 0) {
			first = removeNode.next; // 첫 노드의 next(다음 노드)를 first(노드 시작 주소값)으로 설정
		} else {
			Node<E> prevNode = getNode(index - 1);
			prevNode.next = removeNode.next;
		}

		removeNode.item = null;
		removeNode.next = null;

		size--;
		return removedItem;
	}

	@Override
	public E get(int index) {
		Node<E> node = getNode(index);
		return node.item;
	}

	private Node<E> getNode(int index) {
		Node<E> x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	@Override
	public int indexOf(E item) {

		int index = 0;

		for (Node<E> x = first; x != null; x = x.next) {
			if (item.equals(x.item)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
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

	private static class Node<E> {

		E item;
		Node<E> next;

		public Node(E item) {
			this.item = item;
		}

		// [A->B->C]
		@Override
		public String toString() {
			// loop에서 문자 돌릴 때는 StringBuilder가 좋음
			StringBuilder sb = new StringBuilder();
			Node<E> x = this;
			sb.append("[");
			while (x != null) {
				sb.append(x.item);
				if (x.next != null) {

					sb.append("->");
				}
				x = x.next;
			}
			sb.append("]");

			return sb.toString();
		}
	}
}
