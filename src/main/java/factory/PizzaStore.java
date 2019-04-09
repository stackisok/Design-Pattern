package factory;

public class PizzaStore {

    public Pizza getPizza(String flavor){
        Pizza pz = null;
        if (flavor.equals("Seafood")){
            pz = new SeafoodPizza();

        } else if (flavor.equals("Beef")){
            pz = new BeefPizza();
        }
        return pz;
    }


}
