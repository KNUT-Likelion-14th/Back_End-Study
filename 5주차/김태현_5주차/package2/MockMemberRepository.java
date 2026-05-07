package 김태현_5주차.package2;

import 김태현_5주차.role.Lion;
import 김태현_5주차.role.Role;
import 김태현_5주차.role.Staff;
import java.util.ArrayList;
import java.util.List;

public class MockMemberRepository implements MemberRepository {

    // 미리 만들어둔 가짜 데이터!
    private List<Role> mockData = new ArrayList<>();

    public MockMemberRepository() {
        mockData.add(new Lion("김사자", "컴퓨터공학과", 14, "백엔드", "20220202"));
        mockData.add(new Staff("홍운영", "경영학과", 13, "기획", "대표"));
    }

    @Override
    public void save(Role member) {
        // 실제 저장 안함!
        System.out.println("Mock 저장소 - 실제 저장하지 않습니다.");
    }

    @Override
    public List<Role> findAll() {
        // 가짜 데이터 반환!
        return mockData;
    }

    @Override
    public Role findByName(String name) {
        for (Role member : mockData) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    @Override
    public boolean isDuplicate(String name) {
        for (Role member : mockData) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}