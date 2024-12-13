package c16_object_classes;

import java.util.Objects;

/*
    toString(), equals(), hashCode()

    1. toString() : 객체의 문자열 표현
        기본적으로 모든 클래스는 Object 클래스를 상속 받으며, Object의 toString() 메서드는
        클래스 이름과 해시코드를 반환함 -> 이를 Override를 통해서 재정의해서 사용하는 편

        왜 사용하는가? : 사람이 읽기 좋도록 표기하기 위해서.

    2. equals() : 객체의 동등성 표현
        두 객체가 '논리적으로 같은지'를 비교하는 메서드
        기본적으로 Object 클래스의 equals() 메서드는 두 객체의 참조 주소를 비교합니다.
        형식 :
            객체명1.equals(객체명2)       -> 객체명1과 객체명2의 참조 주소가 동일한지 확인 : 3형식 문장

    3. hashCode() : 객체의 고유 값
        객체를 정수 값(해시값)으로 반환
        해시값은 주로 해시 기반 컬렉션에서 사용됩니다(Collections 파트에서 hashMap, hashSet 개념을 배울 때 언급 예정)
        equals()를 override하면 hashCode()도 '반드시 override'해야 합니다.
            - 동일한 객체(equals() == true)는 동일한 해시 코드를 가져야만 하기 때문인데, 문제는
            - 해시 코드가 같다고 해서 항상 equals()가 true인 것은 아니라는 점입니다.


 */
public class Student {
    /*
        1. Student 클래스에 학생의 이름(name)과, 학번(studentId)를 저장하는 필드를 작성하세요.
        2. equals(), hashCode() 메서드를 재정의하여 학생 객체들이 같은지 여부를 이름과 학번으로 비교하도록 작성하세요.

        지시 사항

            1. Student 클래스는 name과 studentId를 private 접근 지정자로 가지고 있어야 함.
            2. AllArgsConstructor로 생성자를 만들어야 함.
                - student1 - name = "안근수" / studentId = 20241213
                - student2 - name = "여러분본명" / studentId = 20240000
            3. equals() 메서드를 오버라이드하여, 두 학생 객체가 이름과 학번이 모두 같으면 true를 반환하도록 구현해야 함.
            4. hashCode() 메서드를 오버라이드하여, 이름과 학번을 기반으로 한 해시 코드를 반환하도록 구현해야 함.
            5. 각 필드별로 getter와 setter를 구현해야 함.
            6. Student 클래스를 활용하여, 학생 객체를 생성하고 toSting() 메서드를 이용해 학생의 이름과 학번을 포함한
                모든 정보를 출력하는 예제를 작성하시오.
     */

    // 지시사항 1번 - 필드
    private String name;
    private int studentId;

    // 지시사항 2번 - 전체 매개변수 생성자

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // 지시사항 3번 - 메서드
    // 지시사항 4번 - 메서드

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }


    // 지시사항 5번 - 메서드들

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 지시사항 6번 - 메서드
    // 재정의 한 번 해보겠습니다.
    @Override
    public String toString() {
        return "해당 학생의 이름은 " + name + "이고, 학번은 " + studentId + "입니다";
    }
}
