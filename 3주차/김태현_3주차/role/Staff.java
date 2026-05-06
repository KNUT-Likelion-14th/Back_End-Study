package 김태현_3주차.role;

import 김태현_3주차.policy.StaffPolicy;
import 김태현_3주차.policy.SubmitPolicy;

public class Staff extends Member {

    private String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    @Override
    public SubmitPolicy getPolicy() {
        return new StaffPolicy();
    }

    @Override
    public void printInfo() {
        System.out.println("역할: 운영진");
        System.out.println("이름: " + getName());
        System.out.println("전공: " + getMajor());
        System.out.println("기수: " + getGeneration());
        System.out.println("파트: " + getPart());
        System.out.println("직책: " + position);
        System.out.println("과제 제출 가능 여부: " + canSubmit());
    }
}