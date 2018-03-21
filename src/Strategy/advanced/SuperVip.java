package Strategy.advanced;

import Strategy.advanced.annotation.DiscountCondiction;

@DiscountCondiction(min = 3000, max = 10000)
public class SuperVip implements CalcPrice {
    @Override
    public double calcPrice(double price) {
        return price * 0.8;//打8折
    }
}
