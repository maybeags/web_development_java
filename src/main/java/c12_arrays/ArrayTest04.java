package c12_arrays;

import java.util.Arrays;

/*
    여태까지 배운 자바 자체 클래스

    Scanner
    Random
    Arrays
    Integer
    Comparator

    Math.random() 메서드
    Java에서 난수를 생성하기 위해 Math.random() 메서드를 사용할 수 있음
    0.0 ~ 1.0 미만의 난수를 반환

    1. index가 10개인 배열을 만들고 Math.random()을 이용하여 값을 집어넣으시오 -> 1 ~ 10까지의 int 배열을 만들 것
    2. 값이 입력된 배열을 출력할 것
    3. 해당 배열의 합을 구할 것
    4. 짝수만 추출해서 합을 구할 것
 */
public class ArrayTest04 {
    public static void main(String[] args) {
//        double a = Math.random();
//        System.out.println(a);
//
//        // 이상의 메서드를 응용해서 0~9까지의 int가 출력되도록 작성하시오.
//        int b = (int)(Math.random() * 10);
//        System.out.println(b);
//
//        // 이상의 메서드를 응용해서 1 ~ 10까지의 int가 출력되도록 작성하시오.
//        int c = (int)(Math.random() * 10) + 1;
//        System.out.println(c);

        // 1. index가 10개인 배열을 만들고 Math.random()을 이용하여 값을 집어넣으시오

        // 사용할 변수 선언
        int[] numbers = new int[20];
        int sum = 0;
        int sumEven = 0;

        // 각 index를 하나씩 지정하여 손수 작성한 코드
//        numbers[0] = (int)(Math.random() * 10) + 1;
//        numbers[1] = (int)(Math.random() * 10) + 1;
//        numbers[2] = (int)(Math.random() * 10) + 1;
//        numbers[3] = (int)(Math.random() * 10) + 1;
//        numbers[4] = (int)(Math.random() * 10) + 1;
//        numbers[5] = (int)(Math.random() * 10) + 1;
//        numbers[6] = (int)(Math.random() * 10) + 1;
//        numbers[7] = (int)(Math.random() * 10) + 1;
//        numbers[8] = (int)(Math.random() * 10) + 1;
//        numbers[9] = (int)(Math.random() * 10) + 1;

        // 반복문을 통해 한 방에 작성하는 코드
//        for (int i = 0; i < numbers.length ; i++) {
//            numbers[i] = (int)(Math.random() * 10) + 1;
//        }
//
////        2. 값이 입력된 배열을 출력할 것
//        System.out.println(Arrays.toString(numbers));
//
//        // 3. 합 구하는 반복문 작성
//        for(int i = 0 ; i < numbers.length ; i++) {
//            sum += numbers[i];
//        }
//        System.out.println("배열 전체 합 : " + sum);
//
//        // 4. 짝수 합 구하는 반복문 작성
//        for(int i = 0 ; i < numbers.length ; i++) {
//            if(numbers[i] % 2 == 0) {
//                sumEven += numbers[i];
//            }
//            // else 사용할 필요 없음
//        }
//        System.out.println("배열 내 짝수 요소의 합 : " + sumEven);

        // 이상에서 확인할 수 있듯 반복문의 구조가 데이터 입력 당시 / 합을 구할 때 / 짝수 합을 구할 때 동일하다는
        // 것을 볼 수 있습니다.
        for (int i = 0 ;  i < numbers.length ; i++) {
            // 1. 데이터를 입력하는 부분
            numbers[i] = (int)(Math.random() * 10) + 1;
            // 3. 전체 합 구하는 부분
            sum += numbers[i];
            // 4. 짝수 합 구하는 부분
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        // 2. 배열 출력
        System.out.println(Arrays.toString(numbers));
        System.out.println("배열 전체 요소 합 : " + sum);
        System.out.println("배열 짝수 요소 합 : " + sumEven);

    }
}
