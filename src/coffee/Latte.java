package coffee;

class Latte extends Coffee{
    Latte() {
        milk=new Milk();
        milk.setMilkPercentageInCup(80);
    }
}
