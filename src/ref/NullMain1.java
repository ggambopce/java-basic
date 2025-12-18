package ref;

/**
 * null을 할당하면 해당 변수는 Data 인스턴스를 더이상 참조하지 않는다.
 * 아무도 참조 하지않는 인스턴스는 GC가 메모리에서 제거한다.
 */
public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        System.out.println("data = " + data);
    }
}
