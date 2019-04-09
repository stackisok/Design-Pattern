package Strategy.advanced;


public class Customer {
    double totalConsume = 0;
    double currentConsume = 0;
    CalcPrice strategy;

    public double buy(double current){

        totalConsume += current;
        currentConsume = current;


        ResolveAnnotation resolveAnnotation = ResolveAnnotation.getresolveAnnotation();
        strategy = resolveAnnotation.getStrategy(totalConsume);

        return this.strategy.calcPrice(current);

    }


}
