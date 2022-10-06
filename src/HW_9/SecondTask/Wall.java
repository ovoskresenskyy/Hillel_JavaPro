package HW_9.SecondTask;

public class Wall implements Barrier {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getSize() {
        return height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(this);
    }
}
