package abstract_factory_02;

/**
 * Created by aszatyin on 2017-05-24.
 */
//Concrete factory
public class AdultCuisineFactory extends RecipeFactory {
    @Override
    public Sandwich createSandwich() {
        return new BLT();
    }

    @Override
    public Dessert createDessert() {
        return new CremeBrulee();
    }
}
