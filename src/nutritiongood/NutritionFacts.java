package nutritiongood;

public class NutritionFacts {
    // Required parameters
    private final int servingSize;  // (mL)
    private final int servings;     // (per container)

    // Optional parameters - initialized to default values
    private final int calories;     // (per serving)
    private final int fat;          // (g)
    private final int sodium;       // (mg)
    private final int carbohydrate; // (g)

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - default values
        private int calories      = 0;
        private int fat           = 0;
        private int sodium        = 0;
        private int carbohydrate  = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val; return this;
        }

        public Builder fat(int val) {
            fat = val; return this;
        }

        public Builder sodium(int val) {
            sodium = val; return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val; return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize  = builder.servingSize;
        servings     = builder.servings;
        calories     = builder.calories;
        fat          = builder.fat;
        sodium       = builder.sodium;
        carbohydrate = builder.carbohydrate;
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

