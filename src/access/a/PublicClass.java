package access.a;

/**
 * 하나의 자바 파일에 public 클래스는 하나만 사용가능하다
 * 하나의 자바 파일에 default 클래스는 무한정 만들 수 있다.
 */
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1{}

class DefaultClass2{}
