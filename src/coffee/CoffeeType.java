package coffee;

public enum CoffeeType {
    AMERICANO,
    CAPPUCCINO,
    ESPRESSO,
    LATTE,
    MACCHIATO,
    MOCHA;

    public static CoffeeType byOrdinal(int ordinal) {
        for (CoffeeType coffeeType : CoffeeType.values()) {
            if (coffeeType.ordinal() == ordinal)
                return coffeeType;
        }
        return null;
    }
}
