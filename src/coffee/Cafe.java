package coffee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Cafe {

    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        int choosenType = -1;
        int choosenSize = -1;
        int choosenIngredient=-1;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose your coffee:");
            for (CoffeeType coffeeType : CoffeeType.values()) {
                System.out.println(coffeeType.ordinal() + "-" + coffeeType);
            }
            String console;
            while (choosenType > 5 || choosenType < 0) {
                console = reader.readLine();
                choosenType=consoleFilter(console);
            }
            System.out.println("Choose cup size");
            for (CupSize cupSize : CupSize.values()) {
                System.out.print(cupSize.ordinal() + "-" + cupSize + " ");
            }
            System.out.println();
            while (choosenSize > 5 || choosenSize < 0) {
                console = reader.readLine();
                choosenSize=consoleFilter(console);
            }
            System.out.println("Choose ingredient:");
            for (Ingredient ingredient :Ingredient.values()) {
                System.out.print(ingredient.ordinal()+"-"+ingredient+" ");
            }
            System.out.println();
            while (choosenIngredient> 5 || choosenIngredient < 0) {
                console = reader.readLine();
                choosenIngredient=consoleFilter(console);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(factory.getCoffee(Objects.requireNonNull(CoffeeType.byOrdinal(choosenType)),choosenSize,choosenIngredient));

    }
    private static int consoleFilter(String console){
        int choosen=-1;
        try {
            choosen = Integer.parseInt(console);
            if (choosen > 5 || choosen < 0)
                System.out.println("Type from 0 to 5");
        } catch (NumberFormatException e) {
            System.out.println("Not a number, try again:");
        }
        return choosen;
    }

}
