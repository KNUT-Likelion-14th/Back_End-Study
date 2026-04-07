import java.util.Scanner;

public class Main2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // 1. 사자 수 입력받기
            int count = getLionCount();

            // 2. 사자 이름 입력받기 (중복/빈값 검사 포함)
            String[] lionNames = getLionNames(count);

            // 3. 최종 명단 출력
            printLionList(lionNames);

            // 4. 종료 여부 확인 (exit/restart)
            if (isExitRequested()) {
                System.out.println("👋 프로그램을 종료합니다.");
                break;
            }
        }
    }

    //5 이상의 숫자를 입력받는 메서드
    private static int getLionCount() {
        while (true) {
            System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= 5) return n;
                System.out.println("❗ [오류] 5 이상 입력해주세요.");
            } catch (NumberFormatException e) {
                System.out.println("❗ [오류] 숫자만 입력할 수 있습니다.");
            }
        }
    }

    // N마리의 사자 이름을 입력받아 배열로 반환하는 메서드

    private static String[] getLionNames(int count) {
        String[] names = new String[count];
        System.out.println("\n✏️ 아기사자 이름을 입력해주세요.");

        for (int i = 0; i < count; i++) {
            names[i] = getValidName(names, i);
        }
        return names;
    }

    //유효한(비어있지 않고 중복되지 않은) 이름을 하나 입력받는 메서드
    private static String getValidName(String[] existingNames, int currentIndex) {
        while (true) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("⚠️ 이름이 비어있습니다. 다시 입력해주세요.");
                continue;
            }

            if (isDuplicate(existingNames, input, currentIndex)) {
                System.out.println("⚠️ 이미 등록된 이름입니다. 다시 입력해주세요.");
                continue;
            }

            return input;
        }
    }

    //이름 중복 여부를 체크하는 메서드
    private static boolean isDuplicate(String[] names, String newName, int limit) {
        for (int i = 0; i < limit; i++) {
            if (newName.equals(names[i])) return true;
        }
        return false;
    }

    //명단을 출력하는 메서드
    private static void printLionList(String[] names) {
        System.out.println("\n📋 아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < names.length; i++) {
            System.out.println("🦁 " + (i + 1) + ". " + names[i]);
        }
    }

    //프로그램 종료 명령어를 확인하는 메서드
    private static boolean isExitRequested() {
        while (true) {
            System.out.println("\n" + "=========================");
            System.out.println("🛑 종료: 'exit' / 🔄 재시작: 'restart'");
            String cmd = sc.nextLine().toLowerCase().trim();

            if (cmd.equals("exit")) return true;
            if (cmd.equals("restart")) return false;
            System.out.println("❗ 잘못된 명령어입니다.");
        }
    }
}