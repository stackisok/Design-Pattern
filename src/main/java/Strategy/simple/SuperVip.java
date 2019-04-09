package Strategy.simple;

public class SuperVip implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price * 0.8;//打8折
    }
}
