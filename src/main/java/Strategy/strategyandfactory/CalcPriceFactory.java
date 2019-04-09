package Strategy.strategyandfactory;

public class CalcPriceFactory {

    public void getStrategy(Customer customer){
        System.out.println("-----------factory----------");
        if (customer.totalConsume >= 3000){
            customer.strategy = new SuperVip();
        } else if (customer.totalConsume >= 2000){
            customer.strategy = new Vip();
        } else {
            customer.strategy = new Normal();
        }

    }


}
