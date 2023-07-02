package additionalTasks;

public class SecondTask {
    public static final SecondTask INST = new SecondTask();

    private static int ONE_HUNDRED = 100;

    private  int value;

    private SecondTask() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
