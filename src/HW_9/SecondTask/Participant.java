package HW_9.SecondTask;

public class Participant {

    private final String name;
    private final int maxRunningDistance;
    private final int maxJumpHeight;

    public Participant(String name, int maxRunningDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public boolean run(Barrier barrier) {
        return overcomeBarrier(barrier, maxRunningDistance);
    }

    public boolean jump(Barrier barrier) {
        return overcomeBarrier(barrier, maxJumpHeight);
    }

    private boolean overcomeBarrier(Barrier barrier, int possibility) {
        boolean successfulOvercoming = possibility >= barrier.getSize();

        CompetitionPrinter.print(this, possibility, barrier, successfulOvercoming);

        return successfulOvercoming;
    }
}
