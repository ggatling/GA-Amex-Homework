import sun.plugin2.main.client.DisconnectedExecutionContext;

public class Animal {
    //Put instance variables here
    private int numLegs;
    private int topSpeed;
    private String name;
    private Boolean isEndangered;


    //Put constructor here
    public Animal(int numLegs, int topSpeed,Boolean isEndangered,String name){
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.name = name;
        this.isEndangered = isEndangered;
    }

    //Put getters and setters here
    public int getNumLegs(){
        return this.numLegs;
    }

    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }
    public int getTopSpeed(){
        return this.topSpeed;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Boolean getIsEndangered(){
        return this.isEndangered;
    }
    public void setIsEndangered(Boolean isEndangered){
        this.isEndangered = isEndangered;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world");
        //Instantiate new Animal
        Animal animal1 = new Animal(4,25,false,"Elephant");
//        Animal animal2 = new Animal(4,50,true,"Lion");

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal1.getName();
        topSpeed = animal1.getTopSpeed();

        //Print some output - value checking
        System.out.println("The "+ animal1.name + " has a top speed of " + animal1.topSpeed + " mph");

        //Set new name, speed, and endangered properties values using setters
        animal1.setName("Lion");
        animal1.setIsEndangered(true);

        //get new values using getters
        name = animal1.getName();
        topSpeed = animal1.getTopSpeed();

        //Print some output
        System.out.println("The "+ animal1.name + " has a top speed of " + animal1.topSpeed + " mph");
    }
}