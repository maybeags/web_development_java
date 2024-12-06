package c06_condition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        // 사용하는 외부 클래스 명시
        Scanner scanner = new Scanner(System.in);

        // 사용될 변수명 명시
        int score;
        int changedScore;
        String grade = "";

        System.out.print("당신의 점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        changedScore = score/10;
        // int changedScore가 올바른 값이 출력되는지 확인하기 위한 test code
//        System.out.println(changedScore);

        /*
            changedScore = 10 혹은 9면 A
            changedScore = 8 이면 B
            changedScore = 7 이면 C
            changedScore = 6 이면 D
            5 이하면 F

            실행 예
            당신의 점수는 __ 점이고, 학점은 __ 등급입니다.
         */
        if(score < 0 || score > 100) {
            System.out.println("점수를 잘못입력하셨습니다.");
            grade = "X";
        } else {
            switch (changedScore) {
                case 10:
//                    grade = "A";
//                    break;
                case 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
//                case 5: -> 50점대 까지는 커버가 되지만, 40 - 1점까지의 영역에서 오류발생함
                default:
                    grade = "F";
                    break;
            }
        }
        System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");
    }
}
