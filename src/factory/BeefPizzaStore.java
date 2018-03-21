package factory;

public class BeefPizzaStore implements IPizzaStore{
    @Override
    public Pizza getPizza() {
        return new BeefPizza();
    }
}
