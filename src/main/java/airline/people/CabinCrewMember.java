package airline.people;

public class CabinCrewMember extends Person {

    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String relayMessage(){
        return "Please fasten your seatbelts";
    }
}
