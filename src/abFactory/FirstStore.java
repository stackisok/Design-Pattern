package abFactory;

public class FirstStore extends Factory {
    @Override
    Drink getDrink() {
        return new FirstDrink();
    }

    @Override
    Pizza getPizza() {
        return new FirstPizza();
    }
}
