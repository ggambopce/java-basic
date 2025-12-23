package construct;

/**
 * 기본생성자
 * 매개변수가 없는 생성자를 기본 생성자라 한다.
 * 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
 * 생성자는 반드시 호출되어야 한다.
 */
public class MemberDefault {
    String name;

    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
