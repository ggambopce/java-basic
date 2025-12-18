package ref;

/**
 * NullPointerException
 * `null에 .을 찍었을 때 발생한다.
 */
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data.value = " + data.value);
    }
}
