package training;

public class CrossfitTraining extends Workout {

    private final int maxWeight;

    public CrossfitTraining(double durationOfTraining, int averageHeartRate, double athleteWeight, int maxWeight) {
        super(durationOfTraining, averageHeartRate, athleteWeight);
        this.maxWeight = maxWeight;
    }

    @Override
    public String printInformationAboutTraining() {
        return "Кроссфит тренеровка! Длительность: " + getDurationOfTraining() + " минут. " +
                "Середний вес штанги: " + maxWeight / 2 + " кг. " +
                "Килокалорий: " + calorieExpenditure() + ".";
    }
}
