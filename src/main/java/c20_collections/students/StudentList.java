package c20_collections.students;

import java.util.ArrayList;
import java.util.List;

/*
    students 패키지 생성
    Student.java
    StudentList.java 클래스 생성
 */
public class StudentList {
    public static void main(String[] args) {

        // 비어있는 List 선언
        List<Student> students = new ArrayList<>();

        // 20240001 강미경
        // 20240002 강준석
        // 20240003 김은수
        // 20240004 박경호
        // 20240005 박수빈
        // 을 추가하세요.

        Student student1 = new Student(20240001, "강미경");
        students.add(student1);

        students.add(new Student(20240002, "강준석"));
        students.add(new Student(20240003, "김은수"));
        students.add(new Student(20240004, "박경호"));
        students.add(new Student(20240005, "박수빈"));

//        System.out.println(student1);
//        System.out.println(students.get(0));
//        students.get(0).setName("김일");
//        System.out.println(students.get(0).getName());

        // 추가후에 전체 리스트를 출력하세요.

//        System.out.println("전체 리스트 : " + students);
//
//        // 0번지부터 4번지까지 찾아넣었기 때문에 인덱스 넘버 3에 위치한 요소의 학번
//        System.out.println("3번지에 위치한 학생의 학번 : " + students.get(3).getId());
//
//        // 2번지에 위치한 요소의 이름을 콘솔에 출력하시오.
//        System.out.println("2번지에 위치한 학생의 이름 : " + students.get(2).getName());
//
//        // "박수빈" 이름을 가진 객체의 학번을 콘솔에 출력하시오. -> 검색과 관련있습니다. StringList.java 확인해서 만들 것
//        String searchStr = "박수빈";
//        // 일반 for 문
//        for(int i = 0; i < students.size() ; i++ ){
//            if(students.get(i).getName().equals(searchStr)) {   // 문자열을 비교하는 것이기 때문에 ==이 아니라 .equals()를 사용함
//                System.out.println(searchStr + " 학생의 학번 : " + students.get(i).getId());
//            }
//        }
//
//        // 향상된 for 문
//        for(Student student : students) {
//            if(student.getName().equals(searchStr)) {
//                System.out.println(student.getName() + " 학생의 학번 : " + student.getId());
//            }
//        }
//
//        // 20240001 학번을 가진 객체의 이름을 콘솔에 출력하시오 -> 마찬가지로 검색과 관련있습니다.
//
//        int searchInt = 20240001;
//
//        // 일반 for 문
//        for( int i = 0 ; i < students.size() ; i++ ) {
//            if(students.get(i).getId() == searchInt) {  // int냐 String이냐에 따라 조건식 방식이 달라진 부분에 주목하세요
//                System.out.println(searchInt + " 학번을 지닌 학생의 이름 : " + students.get(i).getName());
//            }
//        }
//
//        // 향상된 for 문
//        for (Student student : students) {
//            if(student.getId() == searchInt) {
//                System.out.println(student.getId() + " 학번을 지닌 학생의 이름 : " + student.getName());
//            }
//        }

        //setName() 메서드를 활용합니다
        // id = 20240002인 학생을 찾고, 그 학생의 이름이 강준석이라면, 박승주로 바꿀 것

        for ( Student student : students ) {
            if(student.getId() == 20240002) {
                if (student.getName().equals("강준석")) {
                    student.setName("박승주");
                    System.out.println(student.getId() + " 학번 학생의 이름이 " + student.getName() + "(으)로 바뀌었습니다.");
                    break;
                }
            }
        }

        // list의 요소 삭제 방법
        System.out.println("삭제 전 전체 리스트 : " + students);

        // list에는 인덱스 넘버가 있기 때문에 인덱스 번호로 삭제 가능
        // 인덱스 넘버 이외에도 특정한 문자열을 가지고 있으면 삭제가 가능합니다. -> StringList.java 확인
        students.remove(0);
        System.out.println("삭제 후 전체 리스트 : " + students);

        // 이름이 김은수인 학생 객체를 리스트에서 삭제하는 코드를 작성하시오.

        // 인덱스 넘버로 삭제해야하기 때문에 향상된 for문의 사용이 불가능했습니다.
//        for ( int i = 0 ; i < students.size() ; i++) {
//            if(students.get(i).getName().equals("김은수")) {
//                students.remove(i);
//                break;
//            }
//        }
//        System.out.println("삭제 후 리스트 : " + students);

        // .remove(Object o)를 이용한 방법 -> 이 경우는 향상된 for문도 가능합니다.
        for(Student student : students) {
            if(student.getName().equals("박경호")) {
                students.remove(student);
                break;
            }
        }
        System.out.println("삭제 후 리스트2 : " + students);




    }
}
