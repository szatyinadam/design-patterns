package factory_method_01;

/**
 * Created by aszatyin on 2017-05-22.
 */
public class Program {
    public static void main(String[] args) {
        Sandwich turkeySandwich = new TurkeySandwich();
        Sandwich dagwoodSandwich = new DagwoodSandwich();

        System.out.println("----Turkey sandwich----");
        turkeySandwich.getIngredients()
                .forEach(ingredient -> System.out.println(ingredient.getClass().getSimpleName()));

        System.out.println("----Dagwood sandwich----");
        dagwoodSandwich.getIngredients()
                .forEach(ingredient -> System.out.println(ingredient.getClass().getSimpleName()));
    }
}
