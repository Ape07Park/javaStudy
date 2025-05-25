package array;

public class ArrayDi4 {

    public static void main(String[] args) {

        // 2 * 3 2차원 배열 생성
        int[][] arr = new int[2][3];

        int i = 1;
        // arr을 기준으로 2개의 내용물이 존재 따라서 length는 2임
        for (int row = 0; row < arr.length; row++) {
            // arr[row]를 기준으로 내용물이 3개 따라서 length는 3임
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
