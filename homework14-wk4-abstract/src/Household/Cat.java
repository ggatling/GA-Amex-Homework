package Household;

import Household.Pet;

public class Cat implements Pet {


    @Override
    public String feedPet() {
        return "I fed the Cat";
    }

    @Override
    public String groomPet() {
        return "I took the cat to the groomer";
    }

    @Override
    public String playWithPet() {
        return "Tired,but im playing with the cat";
    }
}
