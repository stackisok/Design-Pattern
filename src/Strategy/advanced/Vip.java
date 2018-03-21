package Strategy.advanced;

import Strategy.advanced.annotation.DiscountCondiction;

@DiscountCondiction(min = 2000, max = 3000)
public class Vip implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price * 0.9;
    }
}
