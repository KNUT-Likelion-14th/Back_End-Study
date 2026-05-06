package 김태현_4주차.package1;

import 김태현_4주차.role.Lion;
import 김태현_4주차.role.Role;
import 김태현_4주차.role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // 멤버 저장할 List
    static List<Role> members = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine().trim());

            if (choice == 1) {
                registerMember();
            } else if (choice == 2) {
                printAllMembers();
            } else if (choice == 3) {
                searchMember();
            } else if (choice == 4) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    // 메뉴 출력
    static void printMenu() {
        System.out.println("\n=== 멤버 관리 시스템 ===");
        System.out.println("1. 멤버 등록");
        System.out.println("2. 전체 멤버 조회");
        System.out.println("3. 이름으로 검색");
        System.out.println("4. 종료");
        System.out.print("선택: ");
    }

    // 멤버 등록
    static void registerMember() {
        System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
        int roleChoice = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("이름: ");
        String name = scanner.nextLine();

        System.out.print("전공: ");
        String major = scanner.nextLine();

        System.out.print("기수: ");
        int generation = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("파트 (백엔드/프론트엔드/기획/디자인): ");
        String part = scanner.nextLine();

        // 중복 이름 확인
        for (Role member : members) {
            if (member.getName().equals(name)) {
                System.out.println("등록 실패: 이미 존재하는 이름입니다.");
                return;
            }
        }

        // 역할에 따라 다른 객체 생성
        if (roleChoice == 1) {
            System.out.print("학번: ");
            String studentId = scanner.nextLine();
            members.add(new Lion(name, major, generation, part, studentId));
        } else if (roleChoice == 2) {
            System.out.print("직책: ");
            String position = scanner.nextLine();
            members.add(new Staff(name, major, generation, part, position));
        }

        System.out.println("등록 완료: " + name);
    }

    // 전체 멤버 조회
    static void printAllMembers() {
        if (members.isEmpty()) {
            System.out.println("등록된 멤버가 없습니다.");
            return;
        }

        System.out.println("\n=== 전체 멤버 목록 ===");
        for (int i = 0; i < members.size(); i++) {
            members.get(i).printSummary(i + 1);  // 번호랑 같이 출력
        }
        System.out.println("총 " + members.size() + "명");
    }

    // 이름으로 검색
    static void searchMember() {
        System.out.print("검색할 이름: ");
        String searchName = scanner.nextLine();

        for (Role member : members) {
            if (member.getName().equals(searchName)) {
                member.printInfo();
                return;
            }
        }
        System.out.println("해당 이름의 멤버가 없습니다.");
    }
}