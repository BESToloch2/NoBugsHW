package accessModifiersStFl;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    public GameSettings( String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static public void setMaxPlayers(int newMaxPlayers){
        GameSettings.maxPlayers = newMaxPlayers;
    }

    public void addPlayer(){

        if (currentPlayers<maxPlayers) {
            currentPlayers += 1;
        }else{
            System.out.println("You reached max number of players on this server");
        }

    }

    public void printGameStatus(){
        System.out.println("Game name: " + gameName);
        System.out.println("Current players num.: " + currentPlayers);
        System.out.println("Max amount of players: " + maxPlayers);
    }

    public static void main(String[] args) {

        GameSettings lol = new GameSettings("LeagueOfLegends", 5);
        GameSettings dot = new GameSettings("Dota 2", 4);

        GameSettings.setMaxPlayers(20);

        lol.addPlayer();
        dot.addPlayer();

        lol.printGameStatus();
        System.out.println();
        dot.printGameStatus();
    }
}
