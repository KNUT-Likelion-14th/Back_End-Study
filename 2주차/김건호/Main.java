import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("= 아기사자 이름 입력 =");
        String name = sc.nextLine();

        System.out.println("= 아기사자 전공 입력 =");
        String depart = sc.nextLine();

        System.out.println("= 아기사자 기수 입력 =");
        int cn = sc.nextInt();

        System.out.println("= 입력값 검증 진행 =");
        Verify verify = new Verify();

        if (verify.verify(name, depart, cn)) {
            System.out.println(" =! 입력값 검증 완료 != ");
            Lion lion = new Lion(name, depart, cn);
            System.out.println("== 아기사자 인적사항 최종출력 ==");
            System.out.println("이름 : " + lion.name + "  | 전공 : " + lion.depart + " | 기수 : " + lion.cn);
        }
    }
}
