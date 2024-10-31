package seedu.healthmate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class ConsumptionStatistics {
    
    private final int idealCalories;
    private final int totalIdealCalories;
    private final int totalCaloriesConsumed;
    private final Optional<MealEntry> maxMeal;

    public ConsumptionStatistics(int idealCalories, int totalIdealCalories,
                                 int totalCaloriesConsumed, Optional<MealEntry> maxMeal) {
        this.idealCalories = idealCalories;
        this.totalIdealCalories = totalIdealCalories;
        this.totalCaloriesConsumed = totalCaloriesConsumed;
        this.maxMeal = maxMeal;
    }

    /**
     * Computes consumption statistics
     * @param user the user for which the ideal consumption mark is computed
     * @param days the number of days going in the past for which the total statistics are computed
     * @param mealEntries the mealEntries based on which the consumption is computed
     * @return A new consumption instance containing the statistics
     */
    public static ConsumptionStatistics computeStats(User user, int days, MealEntriesList mealEntries) {

        LocalDateTime today = DateTimeUtils.currentDate().atTime(23, 59);
        LocalDateTime lastDate = today.minusDays(days);
        MealEntriesList mealsConsumed = mealEntries.getMealEntriesByDate(today, lastDate);
        int totalCaloriesConsumed = mealsConsumed.getTotalCaloriesConsumed();
        int idealCalories = (int) user.getIdealCalories();
        int totalIdealCalories = days * idealCalories;
        Optional<MealEntry> maxMeal = mealsConsumed.getMaxCaloriesConsumed();

        return new ConsumptionStatistics(idealCalories, totalIdealCalories, totalCaloriesConsumed, maxMeal);
    }

    public void printStats(int days) {
        UI.printHistoricConsumptionStats(days, this.idealCalories, this.totalCaloriesConsumed, this.totalIdealCalories, this.maxMeal);
    }

}
