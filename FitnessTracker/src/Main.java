import training.BoxingTraining;
import training.CrossfitTraining;
import training.RunningTraining;
import training.Workout;

public class Main {

    public static void main(String[] args) {

        Workout[] workouts = new Workout[4];
        workouts[0] = new RunningTraining(60, 80, 75, 10);
        workouts[1] = new RunningTraining(20, 84, 60, 5);
        workouts[2] = new CrossfitTraining(50, 76, 70, 70);
        workouts[3] = new BoxingTraining(120, 90, 80);

        for (Workout workout : workouts) {
            System.out.println(workout.printInformationAboutTraining());
        }

    }
}
