package c01_print;
/*
    c01_print 패키지 생성 -> Main.java
    Main.java -> Main이 들어갔다는 것은 해당 파일이 java 프로그램 실행 파일이 됨을 의미함.
 */
public class Main {
    /*
        다중 주석(comment)을 위한 명령어
     */

    //무언가 작성을 한 후에 주석 처리를 하고 싶을 경우 -> 맨 앞에 슬러시 두 개
//    근데 그렇게 하려면 맨 앞으로 넘어가서 슬러시를 두 번 타이핑해야하는데 다른 방법이 뭐가 있는가? -> ctrl + /
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        /*
            주석(comment) : 컴퓨터가 해당 부분은 컴파일링(읽어들이지)하지 않고, 사람이 읽을 수 있도록 하는 영역
         */
        /**
         * 클래스 또는 메서드의 역할을 명시, 또는 설명하기 위한 주석
         */
        // 문자열(String)을 출력하기 위한 방법 -> 해당 문자열을 큰따옴표(")로 감싼다.
        // 문자열의 의미 -> 각 문자들의 합 -> 순서가 있음
        System.out.println(123);
        System.out.println("123");
        System.out.println(123 + 4);
        System.out.println("123" + "4");

    }
}
