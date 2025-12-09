package ref;

/**
 * 자바는 항상 변수의 값을 복사해서 대입한다.
 * 메서드를 호출할 때 사용하는 매개변수도 변수일 뿐 메서드를 호출할 때 매개변수에 값을 전달하는 것도 값을 복사해서 전달한다.
 */
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
