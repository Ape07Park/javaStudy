package chepter4.collection.list;

import static java.util.Arrays.*;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
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

    // 코드 추가
    @Override
    public void add(int index, E e) {

        if (size == elementData.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    // 코드 추가
    private void shiftRightFrom(int index) {

        for(int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        E old = get(index); // 기존값 반환
        elementData[index] = element;
        return old;
    }

    // 코드 추가
    @Override
    public E remove(int index) {

        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }


    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    // 검색
    @Override
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(copyOf(elementData, size)) + " size: " + size + " capacity: "
            + elementData.length;
    }


}
