package week7.knockout_game;

public class Player {

    private String name;
    private boolean knockedOut; // are they still in tha game or not?
    private int knockoutNumber;


    public String getName() {
        return name;
    }

    public String playTurn(DiceCup diceCup) {
        int score = diceCup.rollAll();
        if (playerKnockedOut(score)) {
            knockedOut = true;
        }

        String resultTemplate = "Player %s rolled a total of %d and %s knocked out.  (Your knockout number is %d)";
        String knockedOutOrNot = "was not";
        if (knockedOut) {
            knockedOutOrNot = "was";
            knockoutNumber++;
        }

        String result = String.format(resultTemplate, name, score, knockedOutOrNot ,knockoutNumber);

        return result;
    }

    public boolean playerKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public Player(String name) {
        this.name = name;
        this.knockedOut = false;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }
    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }
}
