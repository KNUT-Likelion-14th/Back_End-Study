package class1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int babylion=0;

        while (true) {
            System.out.println("지정할 아기사자 수를 5이상 입력해주세요.");
            babylion = scanner.nextInt();

            if (babylion >= 5) {
                break;
            }

            System.out.println("! [오류] 5명 이상 입력해주세요.");
        }

        String[] lionList = new String[babylion];
        System.out.println("아기사자의 이름을 입력해주세요.");
        for (int i = 0; i < babylion; i++) {

            lionList[i] = scanner.next();
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for(int i=0;i<babylion;i++){

            System.out.println((i+1)+". 이름: "+lionList[i]);
        }

    }
}
