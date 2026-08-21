package chepter4.collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        // O(n)
        BatchProcessor ArrListbatchProcessor = new BatchProcessor(list);
        ArrListbatchProcessor.logic(50_000);

        System.out.println("=========");

        // O(1)
        BatchProcessor  LinkedListbatchProcessor = new BatchProcessor(linkedList);
        LinkedListbatchProcessor.logic(50_000);

    }
}
