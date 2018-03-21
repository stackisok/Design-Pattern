package abFactory;

public class SecondStore extends Factory {
    @Override
    Drink getDrink() {
        return new SecondDrink();
    }

    @Override
    Pizza getPizza() {
        return new SecondPizza();
    }
}
