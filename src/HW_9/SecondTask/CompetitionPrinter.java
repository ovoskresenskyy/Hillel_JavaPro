package HW_9.SecondTask;

public class CompetitionPrinter {

    public static void print(Participant participant, int maxPossibility, Barrier barrier, boolean success) {
        StringBuilder sb = new StringBuilder();

        sb.append(participant.getClass().getSimpleName())
                .append(" ")
                .append(participant.getName());

        if (success) {
            sb.append(" successfully overcome this ")
                    .append(barrier.getClass().getSimpleName())
                    .append(" at distance ")
                    .append(barrier.getSize());
        } else {
            sb.append(" can't overcome this  ")
                    .append(barrier.getClass().getSimpleName())
                    .append(" at distance ")
                    .append(barrier.getSize())
                    .append(". Max possibility is ")
                    .append(maxPossibility);
        }

        System.out.println(sb);
    }

}
