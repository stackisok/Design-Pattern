package Strategy.simple;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("1000 need pay" + customer.buy(1000));
        System.out.println("Strategy:" + customer.strategy);
        System.out.println("1000 need pay" + customer.buy(1000));
        System.out.println("Strategy:" + customer.strategy);
        System.out.println("1000 need pay" + customer.buy(1000));
        System.out.println("Strategy:" + customer.strategy);
    }
}
