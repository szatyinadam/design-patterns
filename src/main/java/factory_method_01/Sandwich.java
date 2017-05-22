package factory_method_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aszatyin on 2017-05-22.
 */
//Creator
public abstract class Sandwich {
    private List<Ingredient> ingredients = new ArrayList<>();

    public Sandwich() {
        createIngredients();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public abstract void createIngredients();
}
