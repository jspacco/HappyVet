package nutritionbad;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nf = new NutritionFacts()
            .setServingSize(240)
            .setServings(8)
            .setCalories(100)
            .setSodium(35)
            .setCarbohydrate(27);

        System.out.println(nf);

        /*

            Here are the limitations of this approach VS a builder

        🔧 Mutability
            You can change the object after creation, which may lead to bugs or invalid states.
            The nutrtiongood version has all instance variables final
        🧪 No Validation Step
            There's no guaranteed moment when the object is “complete.”
            There may be requirements where we need to check the values.
        😕 Incorrect State Possible
            You can call setters in the wrong order, or forget to set required fields.
            What if there are optional parameters, but if you one you must also set others?
        🧩 Not Subclass-Friendly
            You can't extend this pattern cleanly like you can with a Builder.
            No way to subclass!
    */
    }
}

