package abstract_factory_02;

/**
 * Created by aszatyin on 2017-05-24.
 */
//Abstract factory
public abstract class RecipeFactory {
    public abstract Sandwich createSandwich();
    public abstract Dessert createDessert();
}
