package 김태현_5주차.package2;

import 김태현_5주차.role.Role;
import java.util.List;

public interface MemberRepository {

    // 멤버 저장
    void save(Role member);

    // 전체 멤버 조회
    List<Role> findAll();

    // 이름으로 검색
    Role findByName(String name);

    // 중복 이름 확인
    boolean isDuplicate(String name);
}