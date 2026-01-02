package static2;

/**
 * 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스터럼 참조값의 개념이 없다.
 * 따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.
 * static이 붙은 메서드는 객체 생성이 필요없이 메서드의 호출만으로 기능을 수행한다.
 * 간단한 메서드 하나로 끝나는 유틸리티성 메서드에서 자주 사용된다.
 */
public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++;
        //instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
