package Strategy.simple;

public class Customer {
    double totalConsume = 0d;
    double currentConsume = 0d;
    CalcPrice strategy;

    public double buy(double current){

        totalConsume += current;
        currentConsume = current;

        if (totalConsume >= 3000){
            strategy = new SuperVip();
        } else if (totalConsume >= 2000){
            strategy = new Vip();
        } else {
            strategy = new Normal();
        }
        return strategy.calcPrice(current);

    }


}
