import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름/전공/기수 입력: ");

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("전공: ");
        String major = sc.nextLine();

        System.out.print("기수: ");
        int gen = Integer.parseInt(sc.nextLine());


        Lion2 lion = new Lion2(name, major, gen);
        System.out.println("🚀 객체가 먼저 생성되었습니다.");

        System.out.println("🛠 [Step 2] 객체 내부에서 유효성 검증을 진행합니다...");
        if (lion.isValid()) {
            System.out.println("✅ 유효한 아기사자 상태입니다.");
            lion.printInfo();
        } else {
            System.out.println("❌ [오류] 객체 내부 상태가 유효하지 않습니다.");
        }
    }
}