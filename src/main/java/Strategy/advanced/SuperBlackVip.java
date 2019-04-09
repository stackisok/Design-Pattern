package Strategy.advanced;

import Strategy.advanced.annotation.DiscountCondiction;

@DiscountCondiction(min = 10000)
public class SuperBlackVip implements CalcPrice{

    @Override
    public double calcPrice(double price) {
        return price * 0.6;
    }
}
