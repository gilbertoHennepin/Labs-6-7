package week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {

    private DiceCup diceCup;
    private List<Player> players;


    public static void main(String[] args) {
        Game knockout = new Game();
        knockout.startname();
    }

    public void startname() {


        //        make player objects - need names
//        get knockout numbers
//        create a dice cup
//        play game - take turns until only one player is left
//        each player will roll dice - use dice cup
//        print winner

        diceCup = new DiceCup(2);

        int numberOfPlayers = positiveIntInput("How many players are there?");

       createPlayers(numberOfPlayers);

        setKnockoutNumbers();

        play();

        printGameResults();


    }


    private void createPlayers(int numberOfPlayers) {

        players = new ArrayList<>();

        for (int x = 0; x < numberOfPlayers; x++) {
            String name = stringInput("Enter player " + x + "'s name ");
            Player player = new Player(name);
            players.add(player);
        }
    }

    private void setKnockoutNumbers() {

        for (Player p: players) {

            int knockoutNumber;

            do {
                knockoutNumber = intInput("Player " + p.getName() + ", enter your knock out number"
                    + "It must be 6,7,8 or 9.");
            } while (knockoutNumber < 6 || knockoutNumber > 9); // number must be 6,7,8,9
            p.setKnockoutNumber(knockoutNumber);
        }
    }

    private void play() {
        
        int playerIndex = 0;
        int totalPLayers = players.size();
        
        while (moreThanOnePLayerInPLay()) {

            Player currentPlayer = players.get(playerIndex);

            if (currentPlayer.isKnockedOut()) {
                System.out.println("Sorry " + currentPlayer.getName() + " you are knocked out!");
            } else {
                String ignore = stringInput("Player " + currentPlayer.getName() + " , press enter to roll");
                String turnResult = currentPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex+ 1) % totalPLayers;
        }

    }

    private boolean moreThanOnePLayerInPLay() {

        int totalInPLay = 0;
        for (Player p: players) {
            if (!p.isKnockedOut()) {
                totalInPLay++;
            }
        }

        System.out.println("There are " + totalInPLay + " players in a game.");
        if (totalInPLay > 1) {
            return true;
        }
        else {
            return false;
        }

    }

    private void printGameResults() {

        for (Player plauer: players) {
            if (players.getFirst().isKnockedOut()) {
                System.out.println("Player " + plauer.getName() + " is knocked out!");
            }else {
                System.out.println("Player " + plauer.getName() + " IS THE WINNER!");
            }
        }
    }

}
