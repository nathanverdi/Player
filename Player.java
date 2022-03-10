import java.lang.Math;      //Used for absolute value function
import java.util.Scanner;   //Used for string input

/**
 * Player class for the Space Race game
 * This holds information about the player, such as:
 * Health, Coins, Items
 */
public class Player {

    private int maxHealth = 15;
    private int health;
    private int coins;

    /**
     * Constructor for the player class
     */
    public Player() {
        player.health = 10;
        player.coins = 5;
    }

    // Methods for managing the player's health
    /**
     * Method to handle the player taking damage
     * @param health_value ALL INTS CONVERTED TO POSITIVE the amount of health the player is losing
     * @return true if the player survives, false if the player dies
     */
    public boolean damage(int healthValue) {
        if (player.health - Math.abs(healthValue) < 0) {
            System.out.println("DEBUG: Player out of health...\n");
            player.health = 0;
            return false;
        }
        else {
            player.health -= Math.abs(healthValue);
            return true;
        }
    }

    /**
     * Method to handle the player healing
     * @param health_value ALL INTS CONVERTED TO POSITIVE the amount of health the player is gaining
     */
    public void heal(int healthValue) {
        if (player.health + Math.abs(healthValue) > player.maxHealth) {
            player.health = player.maxHealth;
        }
        else {
            player.health += Math.abs(healthValue);
        }
    }

    /**
     * Checks if a player is alive or dead
     * @return boolean of the player's life status
     */
    public boolean isAlive() {
        player.health > 0 ? return true : return false;
    }

    /**
     * getter for the player's current health value
     * @return the player's health as an int
     */
    public int getHealth() {
        return player.health;
    }

    // Methods for managing the player's coins
    /**
     * Method to handle the player spending coins
     * If a player cannot afford an item, the player's coins will remain untouched
     * @param coin_value ALL INTS CONVERTED TO POSITIVE the price of the item that a player is buying
     * @return true if the player is able to afford the item, false if the player cannot
     */
    public boolean spend(int coinValue) {
        if (player.coins - Math.abs(coinValue) < 0) {
            System.out.println("DEBUG: Player cannot afford this item...\nPlayer coins unchanged\n");
            return false;
        }
        else {
            player.coins -= Math.abs(coinValue);
            return true;
        }
    }

    /**
     * Method to handle the player earning coins
     * @param coin_value ALL INTS CONVERTED TO POSITIVE the number of coins that the player is gaining
     */
    public void earn(int coinValue) {
        player.coins += Math.abs(coinValue);
    }

    /**
     * getter for the player coins value
     * @return the number of coins that the player currently has
     */
    public int getCoins() {
        return player.coins;
    }
}
