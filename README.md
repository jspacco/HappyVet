# A bunch of examples

## HappyVet

Happy Vet is the busiest vet clinic in town. Everyday they have a lineup of regular health check-ups, however sometimes there are cases that require immediate action. Each vet at Happy Vet has their own tablet that lets them know who their next client is. The tablet has the name of the client, the type of visit needed, emergency or regular, and a description of the help needed. As long as there are no emergencies the vet will see that their next client is a regular health checkup. When there is an emergency they will have to take care of that case first before returning to the regular check-ups. If there is more than one emergency at a time each veterinarian will take the next case that is marked as an emergency before returning to the regular health checkups. If they fall behind on the emergencies then each vet will continue to take the oldest emergency available. If they fall behind on regular checkups they will finish the emergencies and then start in on the oldest regular checkup available.

## BloodSugar

TODO: Add description of BloodSugar example.

## items

Three versions of Integer with static factory and caching

## pizza1

This shows how to use the Builder Pattern.

## pizza2

This shows why we need to use <?> to get the correct type of object.

## nutritiongood

The NutritionFacts with a Builder Pattern. This is a good example of how to use the Builder Pattern to create a complex object. The NutritionFacts class has a lot of parameters, and using the Builder Pattern makes it easy to create an object with only the parameters you need. The Builder Pattern also makes it easy to create immutable objects, which is a good practice in Java.

## nutritionbad

This is not the Builder pattern. Here we are just using set methods without an explicit Builder. There are multiple issues here:

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

## other

`Ninja` @Override and toString() method example

`PrintyMcGee` shows off printf