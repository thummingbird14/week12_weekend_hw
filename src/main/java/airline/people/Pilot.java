package airline.people;

public class Pilot extends Person{

    private Rank rank;
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber){
        super(name);
        this.rank = rank;
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public String flyPlane(){
        return "I am flying the plane!";
    }
}
