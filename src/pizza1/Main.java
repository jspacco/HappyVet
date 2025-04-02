package pizza1;

public class Main {
    public static void main(String[] args) {
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.CHEESE)
                .addTopping(Pizza.Topping.ONION)
                .sauceInside()
                .build();

        System.out.println(calzone);
    }
}
