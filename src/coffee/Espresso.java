package coffee;

class Espresso extends Coffee{

    Espresso() {
        milk=new Milk();
        milk.setMilkPercentageInCup(0);
    }
}
