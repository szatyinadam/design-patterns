package factory_method_01;

/**
 * Created by aszatyin on 2017-05-22.
 */
//Concrete creator
public class TurkeySandwich extends Sandwich {
    @Override
    public void createIngredients() {
        getIngredients().add(new Bread());
        getIngredients().add(new Mayonnaise());
        getIngredients().add(new Lettuce());
        getIngredients().add(new Turkey());
        getIngredients().add(new Turkey());
        getIngredients().add(new Bread());
    }
}
