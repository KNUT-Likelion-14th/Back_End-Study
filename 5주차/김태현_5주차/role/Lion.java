package 김태현_5주차.role;

import 김태현_4주차.policy.StaffSubmissionPolicy;
import 김태현_4주차.policy.SubmissionPolicy;

public class Lion extends Role {

    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public SubmissionPolicy getPolicy() {
        return new StaffSubmissionPolicy();
    }

    @Override
    public void printInfo() {
        String submitResult = canSubmit() ? "✅ 가능" : "❌ 불가";
        System.out.println("역할: " + getRoleName());
        System.out.println("이름: " + getName() + " | 전공: " + getMajor()
                + " | 기수: " + getGeneration() + " | 파트: " + getPart());
        System.out.println("학번: " + studentId);
        System.out.println("과제 제출 가능 여부: " + submitResult);
    }

    @Override
    public String getRoleName() {
        return "아기사자";
    }
}