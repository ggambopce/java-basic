package class1;

/**
 * 배열 출력 리팩토링
 */
public class ClassStart5 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        /**
         * 향상된 for문
         * students 리스트 안에서Student 타입의 요소를 하나씩 꺼내서
         * s변수에 담고 반복문 본문을 실행한다
         * List, Set 같은 컬렉션은 데이터 목록을 다루는 구조
         */
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
