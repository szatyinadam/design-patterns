package abstract_factory_02;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

/**
 * Created by aszatyin on 2017-05-24.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Are you an (A)dult or a (C)hild ?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        RecipeFactory factory;

        switch (input) {
            case "A":
                factory = new AdultCuisineFactory();
                break;
            case "C":
                factory = new KidCuisineFactory();
                break;
            default:
                throw new NotImplementedException();
        }

        Sandwich sandwich = factory.createSandwich();
        Dessert dessert = factory.createDessert();

        System.out.println(sandwich.getClass().getSimpleName());
        System.out.println(dessert.getClass().getSimpleName());
    }
}
