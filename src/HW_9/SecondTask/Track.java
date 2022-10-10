package HW_9.SecondTask;

public class Track implements Barrier {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(this);
    }
}
