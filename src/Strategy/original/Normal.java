package Strategy.original;

public class Normal implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price;
    }
}
