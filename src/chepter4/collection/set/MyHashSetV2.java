package chepter4.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets = new LinkedList[DEFAULT_INITIAL_CAPACITY];

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2(LinkedList<Integer>[] buckets) {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {

        this.capacity = capacity;
        initBuckets();
    }

    public boolean add(Object value) {

        int hashIndex = hashIndex(value);
        // 링크드 리스트에 접근
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)

        if (bucket.contains(value)) { // O(n) -> 평균 O(1) 데이터가 1개만 2
            return false;
        }

        bucket.add(value);
        size++;

        return true;
    }

    public boolean contains(Object searchValue) {

        // 내가 찾으려는 값이 hashIndex 번째의 LinkedList 안에 있기에
        // hashIndex로 LinkedList 조회
        // 그 뒤 LinkedList에 contains 로 값 존재 여부 확인

        int hashIndex = hashIndex(searchValue); // O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue);  // O(n) -> 평균 O(1) 데이터가 1개만 2
    }

    public boolean remove(Object value) {

        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; // O(1)

        boolean result = bucket.remove(value); // O(n) -> 평균 O(1) 데이터가 1개만 2

        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];

        // 배열 안에 LinkedList 객체를 생성하여 할당
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashIndex(Object value) {

        int hashCode = value.hashCode();

        return Math.abs(hashCode) % capacity; //절대값으로 쓰는 이유는 음수값이 나올 수 있기 때문 - 음수는 index로 사용 불가
    }
}
