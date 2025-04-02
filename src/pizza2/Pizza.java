package pizza2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Pizza {
    public enum Topping { CHEESE, PEPPERONI, SAUSAGE, ONION, MUSHROOM }

    final Set<Topping> toppings;

    public static class Builder {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public Builder addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            // here we are trying to return "this" instead of having a self() method
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    Pizza(Builder builder) {
        this.toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + toppings;
    }
}
