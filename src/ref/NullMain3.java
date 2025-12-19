package ref;

/**
 * NullPointException이 발생하면 null 값에 .을 찍었다고 생각하자.
 */
public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.value = " + bigData.data.value);
    }
}
