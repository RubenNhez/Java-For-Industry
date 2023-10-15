public class Manager extends Person {
    //Properties
    private String favouredFormation;
    private double respect;
    private double ability;
    private double knowledge;
    private double belief;

    //Constructor
    Manager(String FirstName, String Surname, String Team,String FavouredFormation, double Respect, double Ability, double Knowledge, double Belief)
    {
        super(FirstName,Surname,Team);
        favouredFormation = FavouredFormation;
        respect = Respect;
        ability = Ability;
        knowledge = Knowledge;
        belief = Belief;
    }

    //Setters and Getters
    //FavouredFormation
    public void setFavouredFormation (String favouredFormation) {
        this.favouredFormation = favouredFormation;
    }
    public String getFavouredFormation() {
        return this.favouredFormation;
    }
    //Respect
    public void setRespect(double respect) {
        this.respect = respect;
    }
    public double getRespect() {
        return this.respect;
    }
    //Ability
    public void setAbility (double ability) {
        this.ability = ability;
    }
    public double getAbility() {
        return this.ability;
    }
    //Knowledge
    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }
    public double getKnowledge() {
        return this.knowledge;
    }
    //Belief
    public void setBelief(double belief) {
        this.belief = belief;
    }
    public double getBelief() {
        return this.belief;
    }
}
