package class2.package1;

import java.util.Scanner;


public class step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아기사자 이름을 입력해주세요.");
        String name = scanner.nextLine(); // 공백 입력을 위해 nextLine 권장!

        System.out.println("전공을 입력해주세요.");
        String major = scanner.nextLine();

        System.out.println("기수를 입력해주세요.");
        int generation = scanner.nextInt();


        Lion lion = new Lion(name, major, generation);
        System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");


        if (lion.check()) {
            System.out.println("아기사자 객체가 자신의 상태를 정상적으로 판단했습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            System.out.printf("이름: %s | 전공: %s | 기수: %d\n", lion.name, major, generation);
        } else {
            if (name.isEmpty()) {
                System.out.println("이름이 비어 있습니다.");
            }
            if (major.isEmpty()) {
                System.out.println("전공이 비어 있습니다.");
            }
            if (generation < 1) {
                System.out.println("기수는 1 이상이어야 합니다.");
            }

            System.out.println("잘못된 아기사자 정보입니다.");
        }

    }
}


