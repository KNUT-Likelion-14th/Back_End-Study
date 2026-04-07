public class Lion2 {
    public String name;
    String depart;
    private int generation;

    public Lion2(String name, String depart, int generation) {
        this.name = name;
        this.depart = depart;
        this.generation = generation;
    }

    public boolean isValid() {
        if (name == null || name.isEmpty()) return false;
        if (depart == null || depart.isEmpty()) return false;
        if (generation == 0 || generation < 1) return false;
        return true;
    }

    public void printInfo() {
        System.out.println("🦁 아기사자 정보를 출력합니다.");
        System.out.println("🦁 이름: " + name + " | 🎓 전공: " + generation + " | 🚩 기수: " + generation);
    }
}
