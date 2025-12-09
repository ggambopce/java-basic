package ref;

/**
 * 참조형의 경우 실제 사용하는 객체가 아니라 객체의 위치를 가리키는 참조갑만 복사된다.
 */
public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);
        System.out.println("dataA.value =" + dataA.value);
        System.out.println("dataB.value =" + dataB.value);

        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value =" + dataA.value);
        System.out.println("dataB.value =" + dataB.value);

        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value =" + dataA.value);
        System.out.println("dataB.value =" + dataB.value);
    }
}
