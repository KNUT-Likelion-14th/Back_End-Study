import java.util.Scanner;

public class step1 {
    public static void main(String[] args) {
        Lion2 lion;
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("🦁️ 아기사자 이름을 입력해주세요.");
            String name = sc.nextLine();

            System.out.println("전공을 입력해주세요. ");
            String major = sc.nextLine();

            System.out.println("기수를 입력해주세요. ");
            int gen = Integer.parseInt(sc.nextLine());

            System.out.println("입력값 검증을 진행합니다.");

            // main 메서드가 검증 책임을 가짐
            if (name.isEmpty() || major.isEmpty() || gen < 1) {
                System.out.println("❌ [오류] 유효하지 않은 입력입니다. 객체를 생성하지 않습니다.");
            } else {
                lion = new Lion2(name, major, gen);
                System.out.println("✅ 아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
                break;
            }
        }
        lion.printInfo();
    }
}