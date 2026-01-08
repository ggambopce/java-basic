package extends1.super2;

/**
 * 생성자는 하나만 호출할 수 있다.
 * 두 생성자중 하나를 선택하면 된다.
 *
 */
public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);
        System.out.println("ClassC 생성자");
    }

}
