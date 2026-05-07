package 김태현_5주차.package1;

import 김태현_5주차.role.Role;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private List<Role> members = new ArrayList<>();

    // 멤버 저장
    public void save(Role member) {
        members.add(member);
    }

    // 전체 멤버 조회
    public List<Role> findAll() {
        return members;
    }

    // 이름으로 검색
    public Role findByName(String name) {
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null; // 없으면 null 반환
    }

    // 중복 이름 확인
    public boolean isDuplicate(String name) {
        for (Role member : members) {
            if (member.getName().equals(name)) {
                return true;  // 중복 있음
            }
        }
        return false; // 중복 없음
    }
}