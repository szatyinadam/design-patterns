package abstract_factory_02;

/**
 * Created by aszatyin on 2017-05-24.
 */
//Concrete factory
public class KidCuisineFactory extends RecipeFactory {
    @Override
    public Sandwich createSandwich() {
        return new GrilledCheese();
    }

    @Override
    public Dessert createDessert() {
        return new IceCreamSundae();
    }
}
