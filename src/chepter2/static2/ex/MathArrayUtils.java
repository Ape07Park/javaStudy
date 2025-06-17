package chepter2.static2.ex;

public class MathArrayUtils {

    // 인스턴스 생성을 막기 위해 - 이를 통해 작성자의 의도가 드러난다
    // 적절한 제약이 있는 개발이 좋은 개발

    private MathArrayUtils() {
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) /  arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }


    public static int min(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    // 0번째는 계산하지 않도록 개선함
    public static int min2(int[] arr) {
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


}
