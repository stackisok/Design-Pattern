package Strategy.original;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setStrategy(new Normal());
        System.out.println("In Normal strategy 1000 need pay: " + customer.buy(1000));

        customer.setStrategy(new Vip());
        System.out.println("In Vip strategy 1000 need pay: " + customer.buy(1000));
        customer.setStrategy(new SuperVip());
        System.out.println("In SuperVip strategy 1000 need pay: " + customer.buy(1000));
    }
}
