package pizza2;

public class Main {
    public static void main(String[] args)
    {
        Calzone calzone = new Calzone.Builder()
            .addTopping(Pizza.Topping.CHEESE)
            .sauceInside() // ❌ Compiler error! return type of addTopping() is Pizza.Builder, NOT Calzone.Builder
            .build();
    }
}
