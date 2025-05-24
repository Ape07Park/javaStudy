package array;

public class ArrayRef4 {

    public static void main(String[] args) {
        
        // 배열 생성 및 초기화
        int[] students = {90, 80, 70, 60, 50};

        /**
         * 아래는 불가. 이유는 변수 선언 부분에선 int 배열이란 걸 알 수 있으나
         * 생성 및 초기화 부분에선 그 라인만 봤을 때 어떤 타입인지 알 수 없다.
         */
//        int[] students;
//        students = {90, 80, 70, 60, 50};
        
        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "점수 " + students[i]);
        }
    }
}
