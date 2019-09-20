package Household;

public class Main extends Household implements Pet {
    public static void main(String[] args) {
        Household household1 = new Household();
        System.out.println("Household one has to pay " +  household1.myTax(50000,.20)+" in income tax");
    }

    @Override
    public void feedPet() {

    }

    @Override
    public void groomPet() {

    }

    @Override
    public void playWithPet() {

    }
}
