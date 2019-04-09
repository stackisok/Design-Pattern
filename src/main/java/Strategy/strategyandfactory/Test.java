package Strategy.strategyandfactory;


public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println("1000 need pay" + customer.buy(1000));
        System.out.println("2000 need pay" + customer.buy(2000));
        System.out.println("3000 need pay" + customer.buy(3000));
    }
}
