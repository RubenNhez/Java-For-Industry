public class Player extends Person {
    //Properties
    private String position;
    private double fitness;
    private double passingAccuracy;
    private double shotAccuracy;
    private double shotFrequency;
    private double defensiveness;
    private double aggression;
    private double positioning;
    private double dribbling;
    private double chanceCreation;
    private double offsideAdherence;

    //Constructor
    Player(String FirstName, String Surname, String Team, String Position, double Fitness, double PassingAccuracy, double ShotAccuracy, double ShotFrequency, double Defensiveness, double Aggression, double Positioning, double Dribbling, double ChanceCreation, double OffsideAdherence)
    {
        super(FirstName,Surname,Team);
        position = Position;
        fitness = Fitness;
        passingAccuracy = PassingAccuracy;
        shotAccuracy = ShotAccuracy;
        shotFrequency = ShotFrequency;
        defensiveness = Defensiveness;
        aggression = Aggression;
        positioning = Positioning;
        dribbling = Dribbling;
        chanceCreation = ChanceCreation;
        offsideAdherence = OffsideAdherence;
    }
    //Setter and Getter
    //Position
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return this.position;
    }
    //Fitness
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
    public double getFitness() {
        return this.fitness;
    }
    //PassingAccuracy
    public void setPassingAccuracy(double passingAccuracy) {
        this.passingAccuracy = passingAccuracy;
    }
    public double getPassingAccuracy() {
        return this.passingAccuracy;
    }
    //ShotAccuracy
    public void setShotAccuracy(double shotAccuracy) {
        this.shotAccuracy = shotAccuracy;
    }
    public double getShotAccuracy() {
        return this.shotAccuracy;
    }
    //ShotFrequency
    public void setShotFrequency(double shotFrequency) {
        this.shotFrequency = shotFrequency;
    }
    public double getShotFrequency() {
        return this.shotFrequency;
    }
    //Defensiveness
    public void setDefensiveness(double defensiveness) {
        this.defensiveness = defensiveness;
    }
    public double getDefensiveness() {
        return this.defensiveness;
    }
    //Aggression
    public void setAggression(double aggression) {
        this.aggression = aggression;
    }
    public double getAggression() {
        return this.aggression;
    }
    //Positioning
    public void setPositioning(double positioning) {
        this.positioning = positioning;
    }
    public double getPositioning() {
        return this.positioning;
    }
    //Dribbling
    public void setDribbling(double dribbling) {
        this.dribbling = dribbling;
    }
    public double getDribbling() {
        return this.dribbling;
    }
    //ChanceCreation
    public void setChanceCreation(double chanceCreation) {
        this.chanceCreation = chanceCreation;
    }
    public double getChanceCreation() {
        return this.chanceCreation;
    }
    //OffsideAdherence
    public void setOffsideAdherence(double offsideAdherence) {
        this.offsideAdherence = offsideAdherence;
    }
    public double getOffsideAdherence() {
        return this.offsideAdherence;
    }
}
