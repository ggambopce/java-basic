package construct;

/**
 * 생성자
 * 객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자를 이용하면 된다.
 * this는 인스턴스 자신의 참조값을 가리킨다.
 * 필드 이름과 매개변수이름이 다르면 this가 없어도 멤버 변수에 접근한다.
 */
public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
