package pizza1;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { CHEESE, PEPPERONI, SAUSAGE, ONION, MUSHROOM }

    final Set<Topping> toppings;

    // Recursive generic builder
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // Subclasses override this to return "this"
        // This is critical because if we don't, 
        // then the type is Pizza.Builder and not the subclass
        protected abstract T self();
    }

    // Accept any Pizza.Builder subclass
    Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }

    @Override
    public String toString() {
        return "Pizza with toppings: " + toppings;
    }

    public static void main(String[] args)
    {
        
    }
}
