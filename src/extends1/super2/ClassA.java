package extends1.super2;

/**
 * 상속 관계의 생성자 호출은 결과적으로 부모에서 자식 순서로 실행된다
 * 따라서 부모의 데이터를 먼저 초기화하고 그 다음에 자식의 데이터를 초기화 한다.
 * 상속 관계에서 자식 클래스의 생성자 첫줄에 반드시 super(...)를 호출해야 한다
 * 단, 기본 생성자 super()인 경우 생략할 수 있다.
 */
public class ClassA {
    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}
