package Strategy.advanced;

import Strategy.advanced.annotation.DiscountCondiction;


@DiscountCondiction(max = 2000)
public class Normal implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price;
    }
}
