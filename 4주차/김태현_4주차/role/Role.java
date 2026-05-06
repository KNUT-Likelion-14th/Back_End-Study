package 김태현_4주차.role;

import 김태현_4주차.policy.SubmissionPolicy;

public abstract class Role {

    private String name;
    private String major;
    private int generation;
    private String part;

    public Role(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public abstract SubmissionPolicy getPolicy();
    public abstract void printInfo();
    public abstract String getRoleName();

    public boolean canSubmit() {
        return getPolicy().canSubmit();
    }

    public void printSummary(int index) {
        System.out.println(index + ". [" + getRoleName() + "] " + name + " - " + generation + "기");
    }

    public String getName() {return name;}
    public String getMajor() {return major;}
    public int getGeneration() {return generation;}
    public String getPart() {return part;}
}
