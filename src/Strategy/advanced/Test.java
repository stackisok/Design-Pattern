package Strategy.advanced;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.buy(1000));
        customer = new Customer();
        System.out.println(customer.buy(2000));
        customer = new Customer();
        System.out.println(customer.buy(3000));
        customer = new Customer();
        System.out.println(customer.buy(4000));
        customer = new Customer();
        System.out.println(customer.buy(10000));
    }
}
