package chepter2.access.ex;

public class MaxCounter {

    private int count;

    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

//    public void increment() {
//        if (count < max) {
//            count++;
//        } else {
//            System.out.println("최대값 초과 불가");
//        }
//    }

    public void increment() {
        if (count >= max) {
            System.out.println("초과");
// 여러 검증 로직이 존재 시 검증 통과를 못하면 실행 로직 사용 못하게 나가 버리기도 유용.
// 검증과 실행이 명확하게 분리되기에
            return;
        }
        count++; // 실행 로직

    }

//    public void increment() {
//        if (count >= max) {
//            System.out.println("초과");
//        } else {
//            count++;
//        }
//    }

    public int getCount() {
        return this.count;
    }

}
