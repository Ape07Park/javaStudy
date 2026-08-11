package chepter4.collection.array;

import static java.util.Arrays.*;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        // Object[] newArr = new Object[newCapacity]; // 새 배열 생성(크기 기존 거에 2배)
        //
        // for (int i = 0; i < oldCapacity; i++) {
        //     newArr[i] = elementData[i]; // 기존 배열의 값 새 배열에 복사
        // }

        Object[] newArr = Arrays.copyOf(elementData, newCapacity);

        // 참조값 변경, 새로 만든 배열 참조하도록 하게 하기 위해
        elementData = newArr;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object old = get(index); // 기존값 반환
        elementData[index] = element;
        return old;
    }

    // 검색
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(copyOf(elementData, size)) + " size: " + size + " capacity: "
            + elementData.length;
    }

    public void remove(int index) {
        elementData[index] = null;
        size--;
    }
}
