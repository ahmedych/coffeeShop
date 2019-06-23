public enum Ingredient {
    NONE,
    CINNAMON,
    VANILLA,
    NUTMEG,
    GINGER,
    CLOVES;
    public static Ingredient byOrdinal(int ordinal) {
        for (Ingredient ingredient : Ingredient.values()) {
            if (ingredient.ordinal() == ordinal)
                return ingredient;
        }
        return null;
    }
}
