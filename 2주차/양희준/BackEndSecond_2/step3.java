package BackEndSecond_2;

import BackEndSecond_1.Lion;

public class step3 {
    public static void main(String[] args) {

        System.out.println("아기사자 객체를 생성합니다.");
        Lion people = new Lion("양희준", "소프트웨어학과", 14);

        System.out.println("아기사자 정보를 출력합니다.");
        people.inforamtion();

        System.out.println("\nStep 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");

        people.name = "가나다";

        System.out.println("public 필드 접근 성공");
        System.out.println("아기사자 정보를 출력합니다.");


        //오류
        System.out.println("\nStep 3-2. ");
    }
}
