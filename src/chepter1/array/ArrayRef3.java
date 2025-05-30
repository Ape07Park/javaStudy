package chepter1.array;

public class ArrayRef3 {

    public static void main(String[] args) {

        // 배열 변수 선언
//        int[] students;

        // 배열 생성 및 초기화
        int[] students = new int[]{90, 80, 70, 60, 50};

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수 " + students[i]);
        }
    }
}
