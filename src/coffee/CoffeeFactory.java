package coffee;

class CoffeeFactory {
    Coffee getCoffee(CoffeeType type, int size, int ingredient) {
        Coffee toReturn;
        switch (type) {
            case AMERICANO:
                toReturn=new Americano();
                break;
            case CAPPUCCINO:
                toReturn=new Cappuccino();
                break;
            case ESPRESSO:
                toReturn=new Espresso();
                break;
            case LATTE:
                toReturn=new Latte();
                break;
            case MACCHIATO:
                toReturn=new Macchiato();
                break;
            case MOCHA:
                toReturn=new Mocha();
                break;
            default:
                throw new IllegalArgumentException("Wrong coffee type:" + type);
        }
        toReturn.cupSize=CupSize.byOrdinal(size);
        toReturn.ingredient=Ingredient.byOrdinal(ingredient);
        return toReturn;
    }
}
