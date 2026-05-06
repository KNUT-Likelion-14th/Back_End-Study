package 김태현_3주차;

import 김태현_3주차.role.Lion;
import 김태현_3주차.role.Staff;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 아기사자 정보 입력
        System.out.println("=== 아기사자 정보 입력 ===");
        System.out.print("이름: ");
        String lionName = scanner.nextLine();

        System.out.print("전공: ");
        String lionMajor = scanner.nextLine();

        System.out.print("기수: ");
        int lionGeneration = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        System.out.print("파트: ");
        String lionPart = scanner.nextLine();

        System.out.print("학번: ");
        String lionStudentId = scanner.nextLine();

        // 운영진 정보 입력
        System.out.println("\n=== 운영진 정보 입력 ===");
        System.out.print("이름: ");
        String staffName = scanner.nextLine();

        System.out.print("전공: ");
        String staffMajor = scanner.nextLine();

        System.out.print("기수: ");
        int staffGeneration = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        System.out.print("파트: ");
        String staffPart = scanner.nextLine();

        System.out.print("직책: ");
        String staffPosition = scanner.nextLine();

        // 객체 생성
        Lion lion = new Lion(lionName, lionMajor, lionGeneration, lionPart, lionStudentId);
        Staff staff = new Staff(staffName, staffMajor, staffGeneration, staffPart, staffPosition);

        // 결과 출력
        System.out.println("\n=== 결과 출력 ===");
        lion.printInfo();
        System.out.println();
        staff.printInfo();

        scanner.close();
    }
}