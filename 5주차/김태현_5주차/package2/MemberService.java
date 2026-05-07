package 김태현_5주차.package2;

import 김태현_5주차.role.Role;
import java.util.List;

public class MemberService {

    // 인터페이스에만 의존!
    private final MemberRepository repository;

    // 생성자로 외부에서 주입받아요
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    // 멤버 등록
    public boolean register(Role member) {
        if (repository.isDuplicate(member.getName())) {
            return false;
        }
        repository.save(member);
        return true;
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