package construct;

/**
 * 생성자의 이름은 클래스 이름과 같아야 한다.
 * 첫글자도 대문자로 시작한다
 * 생성자는 반환타입이 없다.
 */
public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * this를 사용하면 생성자 내부에서 다른 생성자를 호출할 수 있다.
     * this()는 생성자 코드의 첫줄에만 작성할 수 있다.
     *
     */
    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
