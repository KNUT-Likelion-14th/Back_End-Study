package 김태현.role;

import 김태현.policy.SubmitPolicy;

public abstract class Member {

    private String name;
    private String major;
    private int generation;
    private String part;

    public Member(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public abstract SubmitPolicy getPolicy();

    public boolean canSubmit() {
        return getPolicy().canSubmit();
    }

    public abstract void printInfo();

    public String getName() {return name;}
    public String getMajor() {return major;}
    public int getGeneration() {return generation;}
    public String getPart() {return part;}
}
