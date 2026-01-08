package extends1.overriding;

/**
 * 메서드 오버라이드
 * 하위 클래스에서 상위 클래스의 메서드를 재정의 하는 과정을 의미한다.
 * 상속 관계에서 사용한다. 부모의 기능을 자식이 다시 정의하는 것이다.
 * 재정의라한다.
 * 메서드 이름이 같아야한다
 * 메서드 매개변수 타입, 순서, 개수가 같아야한다.
 * 반환타입이 같아야한다.
 * 접근 제어자는 상위 클래스의 메서드보다 더 제한적이면 안된다.
 * static, final, private 키워드가 붙은 메서드는 오버라이딩이 될 수 없다.
 * 생성자는 오버라이딩 할 수 없다.
 */
public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
