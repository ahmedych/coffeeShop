package coffee;

class Macchiato extends Coffee{
    Macchiato() {
        milk=new Milk();
        milk.setMilkPercentageInCup(65);
    }
}
