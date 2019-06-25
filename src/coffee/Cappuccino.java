package coffee;

class Cappuccino extends Coffee {
    Cappuccino() {
        milk = new Milk();
        milk.setMilkPercentageInCup(50);
    }
}
