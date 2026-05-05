package 김태현.policy;

public class StaffPolicy implements SubmitPolicy {
    @Override
    public boolean canSubmit() {
        return false;
    }
}
