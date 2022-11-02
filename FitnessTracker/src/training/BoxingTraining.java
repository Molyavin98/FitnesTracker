package training;

public class BoxingTraining extends Workout {

    public BoxingTraining(double durationOfTraining, int averageHeartRate, double athleteWeight) {
        super(durationOfTraining, averageHeartRate, athleteWeight);
    }

    @Override
    public String printInformationAboutTraining() {
        return "Тренеровка по кикбогсингу! Длительность: " + getDurationOfTraining() + " минут. " +
                "Килокалорий: " + calorieExpenditure() + ".";
    }
}
