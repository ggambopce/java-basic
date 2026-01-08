package extends1.super1;

/**
 * this는 자기 자신의 참조를 뜻한다. this는 생략할 수 있다.
 * super는 부모클래스에 대한 참조를 뜻한다.
 */
public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }
}
