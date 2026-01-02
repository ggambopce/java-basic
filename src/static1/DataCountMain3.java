package static1;

/**
 * static 변수에 접근은 클래스명에 .을 사용한다.
 * static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
 * count는 인스턴스영역에 생성되지 않고 메서드영역에서 관리한다.
 *
 */
public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A data1= " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B data2= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C data3= " + Data3.count);

        // 인스턴스를 통한 접근도 가능하지만 클래스를 통해서 접근하는 것이 더 명확하다.
        Data3 data4 = new Data3("D");
        System.out.println("D data4= " + data4.count);
    }
}
