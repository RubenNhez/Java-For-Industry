public class Person {

    //Properties
    private String firstName;
    private String surname;
    private String team;

    //constructor
    Person(String FirstName, String Surname, String Team)
    {
        firstName = FirstName;
        surname = Surname;
        team = Team;
    }
//Create Setter and Getter methods
    //First name setter and getter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    //Surname Setter and Getter
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return this.surname;
    }
    //Team Setter and Getter
    public void setTeam(String team) {
        this.team = team;
    }
    public String getTeam() {
        return this.team;
    }



}
