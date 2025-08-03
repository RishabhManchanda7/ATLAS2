package Day23;

// Product: Pizza interface/abstract class
interface Pizza {
    void preparation();
    void baking();
    void cutting();
    void boxing();
}

// ConcreteProduct: PepperoniPizza
class PepperoniPizza implements Pizza {
    @Override
    public void preparation() {
        System.out.println("Preparing Pepperoni Pizza");
    }

    @Override
    public void baking() {
        System.out.println("Baking Pepperoni Pizza");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting Pepperoni Pizza");
    }

    @Override
    public void boxing() {
        System.out.println("Boxing Pepperoni Pizza");
    }
}

// Creator: PizzaFactory interface/abstract class
interface PizzaFactory {
    Pizza createPizza();
}

// ConcreteCreator: PepperoniPizzaFactory
class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// Driver class
public class Task2 {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();
        Pizza pobj = pfobj.createPizza();

        // Call the pizza preparation process
        pobj.preparation();
        pobj.baking();
        pobj.cutting();
        pobj.boxing();
    }
}
