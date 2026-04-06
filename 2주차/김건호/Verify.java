public class Verify {
    public Boolean verify(String name, String depart, int cn) {
        if (name.equals("")) {
            System.out.println("이름이 비어있습니다.");
            return false;
        }
        else if (depart.equals("")) {
            System.out.println("전공이 비어있습니다.");
            return false;
        }
        else if (cn < 0) {
            System.out.println("기수가 올바르지 않습니다.");
            return false;
        }
        return true;
    }
}
