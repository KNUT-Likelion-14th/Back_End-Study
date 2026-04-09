package class2.package1;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public boolean check() {
        if (this.name.isEmpty()) {
            return false;
        }
        if (this.major.isEmpty()) {
            return false;
        }
        if (this.generation < 1) {
            return false;
        }
        return true;
    }


}