package c09_classes;
/*
    학번, 이름, 점수(ABCDF) field를 선언합니다.
    기본 생성자
    학번을 매개변수로 하는 생성자
    이름을 매개변수로 하는 생성자
    학번, 이름, 점수를 매개변수로 하는 생성자

    showInfo() 메서드를 정의
    학번 : 12345
    이름 : 이일
    점수 : A등급
 */
public class Student {
    // 필드 선언
    int studentCode;
    String name;
    String grade;
    // 생성자 선언
    // 기본 생성자
    Student() {}

    // 매개변수 생성자
    Student(int studentNumber) {
        this.studentCode = studentNumber;
    }

    Student(String name) {
        this.name = name;
    }

    Student(int studentCode, String name, String grade) {
        this.studentCode = studentCode;
        this.name = name;
        this.grade = grade;
    }

    // showInfo() 선언
    void showInfo() {
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + grade + "등급");
    }

}
