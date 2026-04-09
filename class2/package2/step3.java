package class2.package2;

import class2.package1.Lion;

public class step3 {
    public static void main(String[] args) {
        System.out.println("아기사자 객체를 생성합니다.");
        Lion lion = new Lion("임채윤","컴퓨터소프트웨어학과",14);
        System.out.println("아기사자 정보를 출력합니다.");

        System.out.printf("이름: %s | 전공: 컴퓨터소프트웨어학과| 기수: 14\n\n" ,lion.name);

        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");
        lion.name="임지원";
        System.out.println("public 필드 접근 성공");
        System.out.println("아기사자 정보를 출력합니다.");

        System.out.printf("이름: %s | 전공: 컴퓨터소프트웨어학과| 기수: 14" ,lion.name);




//        lion.major="컴퓨터공학과";
//        lion.generation="100";



    }
}
