package training;

public abstract class Workout {

    private final int averageHeartRate;
    private final double durationOfTraining;
    private final double athleteWeight;

    public Workout(double durationOfTraining, int averageHeartRate, double athleteWeight) {
        this.durationOfTraining = durationOfTraining;
        this.averageHeartRate = averageHeartRate;
        this.athleteWeight = athleteWeight;
    }

    //Method for get duration of training
    public double getDurationOfTraining() {
        return durationOfTraining;
    }

    //Method for print information about training
    public abstract String printInformationAboutTraining();

    //Method for calorie calculation
    public float calorieExpenditure() {
        return (float) (0.014 * athleteWeight * durationOfTraining * (0.12 * averageHeartRate - 7));
    }
}
