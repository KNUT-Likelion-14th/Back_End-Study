package 김태현.role;

import 김태현.policy.LionPolicy;
import 김태현.policy.SubmitPolicy;

public class Lion extends Member {

    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public SubmitPolicy getPolicy() {
        return new LionPolicy();
    }

    @Override
    public void printInfo() {
        System.out.println("역할: 아기사자");
        System.out.println("이름: " + getName());
        System.out.println("전공: " + getMajor());
        System.out.println("기수: " + getGeneration());
        System.out.println("파트: " + getPart());
        System.out.println("학번: " + studentId);
        System.out.println("과제 제출 가능 여부: " + canSubmit());
    }
}