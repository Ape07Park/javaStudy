package chepter4.collection.list;

public class BatchProcessor {


    private final MyList<Integer> list;

    /**
     * 의존성 주입: 생성자를 통해서 밖에서 받을 list에 대한 결정을 나중으로 미룬다. 밖에서 나중에 결정해서 넘긴다.
     */
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { // arrayList: O(n), linkedList: O(1)
            list.add(0, i); // 앞에 추가. arrayList: O(n), linkedList: O(1)
        }

        long endTime =System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - start) + "ms");
    }
}
