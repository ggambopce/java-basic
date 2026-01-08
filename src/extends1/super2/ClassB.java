package extends1.super2;

/**
 * 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야한다.
 * 부모클래스의 생성자가 기본 생성자인 경우에는 super()를 생략할 수 있다.
 */
public class ClassB extends ClassA {
    public ClassB(int a) {
        super();
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
