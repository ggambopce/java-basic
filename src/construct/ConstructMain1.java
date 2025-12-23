package construct;

/**
 * 생성자는 인스턴스를 생성하고나서 즉시 호출된다.
 * 마지막에 괄호는 객체를 생성하면서 동시에 생성자를 호출한다는 의미를 포함한다.
 * 참고로 생성자를 여러개 정의하게 되면 하나만 호출하면 된다.
 * 생성자 덕분에 회원의 이름, 나이 성적은 항상 필수로 입력하게 된다.
 * 생성자를 사용하면 필수값을 입력을 보장할 수 있다.
 *
 */
public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 15, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
