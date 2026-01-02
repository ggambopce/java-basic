package final1;

/**
 * final
 * final을 지역변수에 설정할 경우 최초 한번만 할당할 수 있다.
 */
public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        //data1 = 20;

        final int data2 = 10;
        //data2 = 20;

        method(10);
    }

    static void method(final int parameter) {

    }
}
