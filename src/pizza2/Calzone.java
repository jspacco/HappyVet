package pizza2;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone with toppings: " + toppings +
               (sauceInside ? " (sauce inside)" : " (sauce on side)");
    }
}

