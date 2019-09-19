import static org.junit.Assert.*;

public class AnimalTest {

    @org.junit.Test
    public void getNumLegs() {
        Animal animal = new Animal(4,25,false,"Elephant");
        int expected = 4;
        int actual = animal.getNumLegs();

        assertEquals(expected,actual);

    }

    @org.junit.Test
    public void setNumLegs() {
        Animal animal = new Animal(4,25,false,"Elephant");

        animal.setNumLegs(5);
        int expected = 5;
        int actual =  animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getTopSpeed() {
        Animal animal = new Animal(4,25,false,"Elephant");
        int expected = 25;
        int actual = animal.getTopSpeed();

        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setTopSpeed() {
        Animal animal = new Animal(4,25,false,"Elephant");

        animal.setTopSpeed(50);
        int expected = 50;
        int actual = animal.getTopSpeed();

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void getName() {
        Animal animal = new Animal(4,25,false,"Elephant");

        String expected = "Elephant";
        String actual = animal.getName();

        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void setName() {
        Animal animal = new Animal(4,25,false,"Elephant");

        animal.setName("Lion");
        String expected = "Lion";
        String actual = animal.getName();

        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void getIsEndangered() {
        Animal animal = new Animal(4,25,false,"Elephant");
        Boolean expected = false;
        Boolean actual = animal.getIsEndangered();

        assertEquals(expected,actual);

    }

    @org.junit.Test
    public void setIsEndangered() {
        Animal animal = new Animal(4,25,false,"Elephant");

        animal.setIsEndangered(true);

        Boolean expected = true;
        Boolean actual = animal.getIsEndangered();
        assertEquals(expected,actual);

    }
}