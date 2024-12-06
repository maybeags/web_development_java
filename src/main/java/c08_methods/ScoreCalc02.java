package c08_methods;

import java.util.Scanner;

public class ScoreCalc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        int totalSubjects = 1;
        double score1 = 0;
        double score2;
        double totalScore = 0;
        double avgScore = 0;
        boolean endOfCalc = false;
        // 반복문 시작

        while(!endOfCalc) {
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if(score1 == -1) {
                break;
            }
            totalScore = scoreCalculator.calculateSum2(totalScore, score1);

            // 평균 계산 및 출력
            avgScore = scoreCalculator.calculateAvg(totalScore, totalSubjects);
            System.out.println("----입력시 마다 나오는 합계와 평균입니다 ----");
            System.out.println("입력한 점수를 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            // 평균 계산을 끝낸 뒤에 과목 수를 증가시키면 된다.
            totalSubjects++;
        }

    }
}
