package models;

/**
 * The Stats class represents the statistics of a character in the game.
 */
public class Stats {
    
    /** The level of the character. */
    private static int level;
    
    /** The health points of the character. */
    private static int health;
    
    /** The dexterity attribute of the character. */
    private static int dexterity;
    
    /** The intelligence attribute of the character. */
    private static int intelligence;
    
    /** The endurance attribute of the character. */
    private static int endurance;
    
    /** The strength attribute of the character. */
    private static int strength;
    
    /** The faith attribute of the character. */
    private static int faith;
    
    /** The amount of runes possessed by the character. */
    private static int runes;

    /**
     * Constructs a new Stats object with default values.
     */
    public Stats(){}

    /**
     * Constructs a new Stats object with the specified parameters.
     * @param level The level of the character.
     * @param health The health points of the character.
     * @param dexterity The dexterity attribute of the character.
     * @param intelligence The intelligence attribute of the character.
     * @param endurance The endurance attribute of the character.
     * @param strength The strength attribute of the character.
     * @param faith The faith attribute of the character.
     */
    public Stats(int level, int health, int dexterity, int intelligence, int endurance, int strength, int faith) {
        this.level = level;
        this.health = health;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.strength = strength;
        this.faith = faith;
        runes = 1000; // Initializing runes with default value
    }

    /**
     * Decreases the amount of runes possessed by the character based on their level.
     */
    public void decreaseRunes(){
        runes -= (this.level * 100 / 2);
    }

    /**
     * Increases the health points of the character.
     * @param amount The amount by which health points are increased.
     */
    public void increaseHealth(int amount) {
        this.health += amount;
    }

    /**
     * Increases the level of the character.
     * @param amount The amount by which level is increased.
     */
    public void increaseLevel(int amount) {
        this.level += amount;
    }

    /**
     * Increases the dexterity attribute of the character.
     * @param amount The amount by which dexterity is increased.
     */
    public void increaseDexterity(int amount) {
        this.dexterity += amount;
    }

    /**
     * Increases the intelligence attribute of the character.
     * @param amount The amount by which intelligence is increased.
     */
    public void increaseIntelligence(int amount) {
        this.intelligence += amount;
    }

    /**
     * Increases the endurance attribute of the character.
     * @param amount The amount by which endurance is increased.
     */
    public void increaseEndurance(int amount) {
        this.endurance += amount;
    }

    /**
     * Increases the strength attribute of the character.
     * @param amount The amount by which strength is increased.
     */
    public void increaseStrength(int amount) {
        this.strength += amount;
    }

    /**
     * Increases the faith attribute of the character.
     * @param amount The amount by which faith is increased.
     */
    public void increaseFaith(int amount) {
        this.faith += amount;
    }

    // Getters for individual stats

    /**
     * Gets the level of the character.
     * @return The level of the character.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the health points of the character.
     * @return The health points of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the dexterity attribute of the character.
     * @return The dexterity attribute of the character.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Gets the intelligence attribute of the character.
     * @return The intelligence attribute of the character.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Gets the endurance attribute of the character.
     * @return The endurance attribute of the character.
     */
    public int getEndurance() {
        return endurance;
    }

    /**
     * Gets the strength attribute of the character.
     * @return The strength attribute of the character.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the faith attribute of the character.
     * @return The faith attribute of the character.
     */
    public int getFaith() {
        return faith;
    }

    /**
     * Gets the amount of runes possessed by the character.
     * @return The amount of runes possessed by the character.
     */
    public int getRunes(){
        return runes;
    }
}
