package class1;

/**
 * 학생정보 출력 프로그램에 배열 적용
 * 학생을 추가 할때 배열에 학생 데이터만 추가하면 된다
 * 배열을 사용한다고 하더라도 데이터를 필드로 개별 관리를 해야한다.
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적:" + studentGrades[i]);

        }

    }
}
