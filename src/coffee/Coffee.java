package coffee;

public abstract class Coffee {
    Milk milk;
    CupSize cupSize;
    Ingredient ingredient;

    @Override
    public String toString() {
        return cupSize + " cup of "
                + this.getClass().getSimpleName()
                + " with " + ingredient;
    }
}
