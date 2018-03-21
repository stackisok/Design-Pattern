package abFactory;

public class Test {
    public static void main(String[] args) {
        Factory fir = new FirstStore();
        Drink firDrink = fir.getDrink();
        Pizza firPizza = fir.getPizza();
        Factory sec = new SecondStore();
        Drink secDrink = sec.getDrink();
        Pizza secPizza = sec.getPizza();
    }
}
