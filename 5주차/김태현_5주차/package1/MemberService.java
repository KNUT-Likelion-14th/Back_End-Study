package 김태현_5주차.package1;

import 김태현_5주차.role.Role;

import java.util.List;

public class MemberService {

    // Repository 를 직접 생성! (강한 결합)
    private MemberRepository repository = new MemberRepository();

    // 멤버 등록
    public boolean register(Role member) {
        // 중복 확인
        if (repository.isDuplicate(member.getName())) {
            return false; // 중복이면 등록 실패
        }
        repository.save(member);
        return true; // 등록 성공
    }

    // 전체 멤버 조회
    public List<Role> findAll() {
        return repository.findAll();
    }

    // 이름으로 검색
    public Role findByName(String name) {
        return repository.findByName(name);
    }
}
