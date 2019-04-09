package Strategy.original;

public class Customer {
    double totalConsume = 0d;
    double currentConsume = 0d;
    CalcPrice strategy;

    public double buy(double current){

        return strategy.calcPrice(current);

    }

    public void setStrategy(CalcPrice strategy) {
        this.strategy = strategy;
    }
}
