import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Squad[] squads = new Squad[32];

    public static void main(String[] args) {
        //Getting players
        ArrayList<Player> players = new ArrayList<>();
        String playersfile = "Players.csv";
        File file = new File(playersfile);
        try {
            Scanner input = new Scanner(file);
            //Skip the first line
            input.nextLine();
            //Get the player's stats
            while (input.hasNextLine()) {
                String nextline = input.nextLine();
                //Stores players into a string
                String[] playersline = nextline.split("\\,");
                //Store each player's stat
                String firstname = playersline[0];
                String surname = playersline[1];
                String team = playersline[2];
                String position = playersline[3];
                double fitness = Double.parseDouble(playersline[4]);
                double PassingAccuracy = Double.parseDouble(playersline[5]);
                double ShotAccuracy = Double.parseDouble(playersline[6]);
                double ShotFrequency = Double.parseDouble(playersline[7]);
                double defensiveness = Double.parseDouble(playersline[8]);
                double aggression = Double.parseDouble(playersline[9]);
                double positioning = Double.parseDouble(playersline[10]);
                double dribbling = Double.parseDouble(playersline[11]);
                double ChanceCreation = Double.parseDouble(playersline[12]);
                double OffsideAdherence = Double.parseDouble(playersline[13]);
                //Add player to players list
                Player player = new Player(firstname, surname, team, position, fitness, PassingAccuracy, ShotAccuracy, ShotFrequency, defensiveness, aggression, positioning, dribbling, ChanceCreation, OffsideAdherence);
                players.add(player);

//                System.out.println("number of players:" + players.size());

            }

//            System.out.println(players);


            //after loop close the scanner
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Getting managers
        ArrayList<Manager> managers = new ArrayList<>();
        String managersfile = "Managers.csv";
        File fileone = new File(managersfile);
        try {
            Scanner input = new Scanner(fileone);
            //Skip the first line
            input.nextLine();
            //Get the Manager's stats
            while (input.hasNextLine()) {
                String nextline = input.nextLine();
                //Stores managers into a string
                String[] managersline = nextline.split("\\,");
                //Store each manager's stat
                String firstname = managersline[0];
                String surname = managersline[1];
                String team = managersline[2];
                String FavouredFormation = managersline[3];
                double respect = Double.parseDouble(managersline[4]);
                double ability = Double.parseDouble(managersline[5]);
                double knowledge = Double.parseDouble(managersline[6]);
                double belief = Double.parseDouble(managersline[7]);
                //Add manager to managers list
                Manager manager = new Manager(firstname, surname, team, FavouredFormation, respect, ability, knowledge, belief);
                managers.add(manager);
//
            }
//            System.out.println(managers);


            //after loop close the scanner
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Add a squad to a squads array
        for (int i = 0; i < managers.size(); i++) {
            Squad newsquad = new Squad(managers.get(i).getTeam(), managers.get(i));
            //match the players to the teams
            for (int j = 0; j < players.size(); j++) {

                if (Objects.equals(players.get(j).getTeam(), managers.get(i).getTeam())) {
                    newsquad.addPlayer(players.get(j));
                }
            }

            squads[i] = newsquad;
            getTeam(newsquad);
//            System.out.println(newsquad);
        }
//        System.out.println(squads[0].getManager().getTeam());

    }
        public static Team getTeam (Squad s){
            Team t = new Team(s.getTeamName(), s.getManager());
            //Get the number of defenders, midfielders and forwards
            String defenders = String.valueOf(s.getManager().getFavouredFormation().charAt(0));
            String midfielders = String.valueOf(s.getManager().getFavouredFormation().charAt(2));
            String forwards = String.valueOf(s.getManager().getFavouredFormation().charAt(4));
            //Store the favoured formation in an array of integers
            int[] favouredformation = {0,0,0};
            favouredformation[0] = Integer.parseInt(defenders);
            favouredformation[1] = Integer.parseInt(midfielders);
            favouredformation[2] = Integer.parseInt(forwards);

            //Add the players based on the formation and their position (there are 7 managers with 4-4-2) 7X
            for (int i = 0; i < 25; i++) {
                int def = 0;
                int mid = 0;
                int forw = 0;
                int goal = 0;
                //add the players
                while (def < favouredformation[0]) {
                    if (s.getPlayer(i).getPosition() == "Defender") {
                        t.addPlayer(s.getPlayer(i));
                    }
                    def = def + 1;
                }
                while (mid < favouredformation[1]) {
                    if(s.getPlayer(i).getPosition() == "Midfielder") {
                        t.addPlayer(s.getPlayer(i));
                    }
                    mid = mid + 1;
                }
                while (forw < favouredformation[2]) {
                    if(s.getPlayer(i).getPosition() == "Forward") {
                        t.addPlayer(s.getPlayer(i));
                    }
                    forw = forw + 1;
                }
                while(goal != 1) {
                    if(s.getPlayer(i).getPosition() == "Goal keeper") {
                        t.addPlayer(s.getPlayer(i));
                    }
                    goal = goal + 1;
                }
                System.out.println(t);
            }

            return t;
        }

    public static void runTournament(){

    }
}