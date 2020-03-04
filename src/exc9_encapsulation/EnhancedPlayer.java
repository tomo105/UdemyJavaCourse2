package exc9_encapsulation;

public class EnhancedPlayer {
    private String playerName;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String playerName, int health, String weapon) {
        this.playerName = playerName;
        if(health <= 100 && health > 0)
            this.health = health;

        this.health = health;
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
