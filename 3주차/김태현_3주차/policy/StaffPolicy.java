package 김태현_3주차.policy;

public class StaffPolicy implements SubmitPolicy {
    @Override
    public boolean canSubmit() {
        return false;
    }
}