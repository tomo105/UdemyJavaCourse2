package exc9_encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        if(this.health < 0 )
        {
            System.out.println("player has no remaining health");
            return 0;
        }

        System.out.println("Remainig health " + this.health);
        return this.health;
    }

}
