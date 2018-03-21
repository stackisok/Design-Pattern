package Strategy.strategyandfactory;

public class Customer {
    double totalConsume = 0;
    double currentConsume = 0;
    CalcPrice strategy;

    public double buy(double current){

        totalConsume += current;
        currentConsume = current;

        new CalcPriceFactory().getStrategy(this);
        return strategy.calcPrice(current);

    }


}
