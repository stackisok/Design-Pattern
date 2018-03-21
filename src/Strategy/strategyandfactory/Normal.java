package Strategy.strategyandfactory;

public class Normal implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price;
    }
}
