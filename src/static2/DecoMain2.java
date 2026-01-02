package static2;

/**
 * 클래스 메서드
 * static이 붙은 정적 메서드는 객체 생성 없이 클래스 . 메서드 명으로 바로 호출할 수 있다.
 * 인스턴스 메서드
 * static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다.
 */
public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
