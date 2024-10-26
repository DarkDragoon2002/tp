package seedu.healthmate;

import java.time.LocalDateTime;
import java.util.Optional;

public class Meal {
    private final Optional<String> name;
    private final int calories;

    public Meal(Optional<String> name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public static Meal extractMealFromString(String input,
                                             String command) throws EmptyCalorieException, BadCalorieException {
        Optional<String> mealDescription = extractMealDescription(input, command);
        int calories = Parameter.getCalories(input);
        Meal meal = new Meal(mealDescription, calories);
        return meal;
    }

    public static Optional<String> extractMealDescription(String input,
                                                          String command) {
        int mealDescriptionIndex = input.indexOf(command) + command.length();
        int calorieIndex = input.indexOf(Parameter.CALORIE_SIGNALLER.getPrefix());
        if (calorieIndex == -1) {
            calorieIndex = input.length();
        }
        return Optional.ofNullable(input.substring(mealDescriptionIndex, calorieIndex).strip());
    }

    public boolean descriptionIsEmpty() {
        return this.name.orElse("").length() == 0;
    }

    public boolean isBeforeEqualDate(LocalDateTime timestamp) {
        return false;
    }

    public boolean isAfterEqualDate(LocalDateTime timestamp) {
        return false;
    }

    public String toSaveString() {
        return this.name.orElse("") + "," + this.getCalories();
    }

    public Optional<String> getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return this.name.orElse("Meal") + " with " + this.calories + " calories";
    }
}

