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
        } else{
            count++;
        }
    }

   public int getCount() {
        return this.count;
   }

}
