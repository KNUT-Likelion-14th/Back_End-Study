package class2.package1;

import java.util.Scanner;


public class step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아기사자의 이름을 입력해주세요.");
        String name = scanner.next();

        System.out.println("전공을 입력해주세요.");
        String major = scanner.next();

        System.out.println("기수를 입력해주세요.");
        int generation = scanner.nextInt();


        System.out.println("입력값 검증을 진행합니다.");
        if(name.isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
        } else if (major.isEmpty()) {
            System.out.println("전공은 비어있을 수 없습니다.");
        } else if(generation<1) {
            System.out.println("기수는 1보다 커야합니다.");
        } else {

            System.out.println("입력값 검증을 통과하여 객체를 생성을 진행합니다.");
            Lion lion = new Lion(name,major,generation);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");

            System.out.println("아기사자의 정보를 출력합니다.");

            System.out.printf("이름: %s | 전공: %s | 기수: %d" ,lion.name,lion.major,generation);
        }
    }
}



