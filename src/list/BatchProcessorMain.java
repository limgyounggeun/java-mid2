package list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        MyList<Integer> list2 = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        BatchProcessor processor2 = new BatchProcessor(list2);
        processor.logic(50_000);
        processor2.logic(50_000);
    }
}
