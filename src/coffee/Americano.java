package coffee;

class Americano extends Coffee{
    Americano() {
        milk=new Milk();
        milk.setMilkPercentageInCup(0);
    }
}
