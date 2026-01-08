package extends1.ex2;

import extends1.ex1.ElectricCar;
import extends1.ex1.GasCar;

/**
 * 부모 클래스는 자식클래스에 접근 할 수 없다.
 * 자식 클래스는 부모 클래스의 기능을 물려받아서 사용할 수 있다.
 * 자바는 다중 상속을 지원하지 않는다.
 * 하나의 인스턴스에 부모클래스와 자식클래스가 모두 생성된다.
 * 자식 클래스로 접근해서 부모 메서드를 찾으로 부모클래스로 올라가서 찾는다.
 */
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
