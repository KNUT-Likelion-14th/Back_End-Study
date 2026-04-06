import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("아기사자 수를 입력하세요. : ");

        int n = sc.nextInt();
        String[] member = new String[n];

        System.out.println("아기사자 이름을 입력해주세요 : ");

        for(int i = 0; i <  n; i++) {
            member[i] = sc.next();
            System.out.println(i);
        }

        System.out.println("아기사자 명단 최종출력");

        for(int i = 0; i < n; i++) {
            System.out.println((i+1) + ". " + member[i]);
        }
    }
}