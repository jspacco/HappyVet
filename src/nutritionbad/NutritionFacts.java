package nutritionbad;

public class NutritionFacts {
    private int servingSize;   // required
    private int servings;      // required
    private int calories;      // optional
    private int fat;           // optional
    private int sodium;        // optional
    private int carbohydrate;  // optional

    public NutritionFacts setServingSize(int servingSize) {
        this.servingSize = servingSize;
        return this;
    }

    public NutritionFacts setServings(int servings) {
        this.servings = servings;
        return this;
    }

    public NutritionFacts setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public NutritionFacts setFat(int fat) {
        this.fat = fat;
        return this;
    }

    public NutritionFacts setSodium(int sodium) {
        this.sodium = sodium;
        return this;
    }

    public NutritionFacts setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
        return this;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}

