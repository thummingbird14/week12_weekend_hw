package airline.people;

public class Passenger extends Person{

    private int numberBags;

    public Passenger(String name, int numberBags) {
        super(name);
        this.numberBags = numberBags;
    }
    public String getName(){
        return name;
    }

    public int getNumberBags() {
        return numberBags;
    }
}
