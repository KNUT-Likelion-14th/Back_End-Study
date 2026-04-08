import java.util.Scanner;

public class FirstSession {
} public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int people = 0;

    while (true) {
        System.out.println("저장할 아기사자 수를 입력해주세요: ");
        people = scanner.nextInt();

        scanner.nextLine();

        if (people < 5) {
            System.out.println("! [오류] 5 이상 입력해주세요.");
        } else break;
    }

    String[] names = new String[people];
    System.out.println("아기사자 이름을 입력해주세요.");
    for (int i = 0; i < people; i++) {
        names[i] = scanner.nextLine();
    }

    System.out.println("\n아기사자 명단을 최종적으로 출력합니다.");
    for (int i = 0; i < names.length; i++) {
        System.out.println((i+1) + ". " + names[i]);
    }

    scanner.close();
}
