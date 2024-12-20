package c20_collections.students;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        // Map 선언
        Map<Integer, String> studentMap = new HashMap<>();

        /*
            데이터를 입력하세요.
            20240001 김일
            20240002 김이
            20240003 김삼
            20240005 김오
            20240006 김육
         */
        studentMap.put(20240001, "김일");
        studentMap.put(20240002, "김이");
        studentMap.put(20240003, "김삼");
        studentMap.put(20240004, "김사");
        studentMap.put(20240005, "김오");
        studentMap.put(20240006, "김육");

        // studentMap을 출력하세요.
        System.out.println(studentMap);

        // studentMap의 key 값들을 Set으로 받아오세요.
        Set<Integer> keySet = studentMap.keySet();
        System.out.println(keySet);

        // keySet의 모든 요소들을 keyList로 옮기세요.
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(keySet);
        System.out.println(keyList);
        // 혹시나 순서대로 정렬하고 싶으시면 StudentSet.java에서 int orderId 부분부터 확인하시면 됩니다.

        System.out.println(studentMap.get(20240001));
        System.out.println(studentMap.get(20240002));
        System.out.println(studentMap.get(20240003));
        System.out.println(studentMap.get(20240004));
        System.out.println(studentMap.get(20240005));
        System.out.println(studentMap.get(20240006));

        // 각 키의 value들을 콘솔에 출력하세요.
        /*
            실행 예
            김일
            김이
            김삼
            김사
            김오
            김육
         */
    }
}
