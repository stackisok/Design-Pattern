package Strategy.original;

public class Vip implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price * 0.9;
    }
}
