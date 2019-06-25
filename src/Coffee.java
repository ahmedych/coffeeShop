import java.util.List;

public abstract class Coffee {
    Milk milk;
    CupSize cupSize;
    Ingredient ingredient;

    @Override
    public String toString() {
        return cupSize + " cup of "
                + this.getClass().getName()
                + " with " + ingredient
                +milk.getMilkPercentageInCup();
    }
}
