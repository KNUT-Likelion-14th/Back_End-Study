package BackEndSecond_1;

public class Lion {

    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public boolean isValid() {
        boolean valid = true;
        if (name == null || name.isEmpty()) {
            System.out.println("이름이 비어 있습니다.");
            valid = false;
        }

        if (major == null || major.isEmpty()) {
            System.out.println("전공이 비어 있습니다.");
            valid = false;
        }

        if (generation <1 ) {
            System.out.println("잘못된 아기사자 정보입니다.");
            valid = false;
        }
        return  valid;
    }

    public void inforamtion() {
        System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + generation);
    }
}
