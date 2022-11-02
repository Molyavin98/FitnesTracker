package training;

public class RunningTraining extends Workout {

    private final double distance;

    public RunningTraining(double durationOfTraining, int averageHeartRate, double athleteWeight, double distance) {
        super(durationOfTraining, averageHeartRate, athleteWeight);
        this.distance = distance;
    }

    @Override
    public String printInformationAboutTraining() {
        return "Беговая тренеровка! Длительность: " + getDurationOfTraining() + " минут. " +
                "Дистанция: " + distance + ". " +
                "Килокалорий: " + calorieExpenditure() + ".";
    }
}
