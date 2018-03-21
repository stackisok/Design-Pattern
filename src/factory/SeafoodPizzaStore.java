package factory;

public class SeafoodPizzaStore implements IPizzaStore{
    @Override
    public Pizza getPizza() {
        return new SeafoodPizza();
    }
}
