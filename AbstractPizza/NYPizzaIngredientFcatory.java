package Design.AbstractPizza;

public class NYPizzaIngredientFcatory implements PizzaIngredientFactory {
    public Dough createDough() { return new ThinCrustDough(); }
}
