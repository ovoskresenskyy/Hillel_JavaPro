package HW_9.SecondTask;

public class MainApp {
    public static void main(String[] args) {

        Participant[] competitors = {
                new Human("Lady Bug", 8, 8),
                new Cat("Noir", 10, 10),
                new Robot("Iron-man", 100, 100)
        };

        Barrier[] obstacleCourse = {
                new Track(8),
                new Wall(10),
                new Wall(80)
        };

        for (Participant competitor : competitors) {
            boolean inGame = true;

            for (int i = 0; i < obstacleCourse.length && inGame; i++) {
                inGame = obstacleCourse[i].overcome(competitor);
            }
        }
    }
}
