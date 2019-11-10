package application;

/**
 * This class represents the parent class for all characters in the game (both Heros and Enemies).
 * 
 * @author sharisinclair
 *
 */
public class GameCharacters {
    private String name;
    private int attack;
    private int defense;
    private int stamina;
    private int currentStamina;
    private boolean hasPotion;
    private boolean hasRevive;
    private boolean isDefending;
    private int gold;
    private int xp;
    private int mana;
    // Will be changed according to whether we use a Bag class/arraylist of items
    //private ArrayList<Items>;
    private double x;
    private double y;
    private double height;
    private double width;

    /**
     * The constructor initializes the necessary instance variables to O and false.
     */
    public GameCharacters(){
	gold = 0;
	xp = 0;
	isDefending = false;
	x = 0;
	y = 0;
	height = 0.0;
	width = 0.0;
    }

    /**
     * This method takes in an game character and makes changes to its stamina when it is attacked by another character.
     * 
     * @param character The character currently being attacked.
     */
    public void attack(GameCharacters character){ 
	setIsDefending(false);
	int attackValue = getAttack() - character.getDefense();
	character.setCurrentStamina(character.getCurrentStamina() - attackValue);
	//To Add: change x coordinate so character moves forward and back when he attacks
    }
    
    /**
     * This method changes isDefending to true when the player chooses the option to defend.
     */
    public void defend() { 
	//When enemy is attacking, if isDefending = true, attack = 0/ no effect
	setIsDefending(true);
    } 

    /**
     * This method takes in the potion with a set value and adds that value to the currentStamina of the hero.
     * @param potionValue
     */
    public void heal(int potionValue){
	//Will be changed to get from Potion ArrayList instead instance variable/ 
	setCurrentStamina(getCurrentStamina() + potionValue);
    }

    /**
     * This method increases the attack, defense and stamina of the hero when certain conditions are met.
     */
    public void levelUp(){
	//change increase number
	int atk = getAttack();
	atk = atk + 2;
	int defense = getDefense();
	defense = defense + 2;
	int stam = getStamina();
	stam = stam + 2;
    }

    public double getX() {
	return x;
    }
    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }

    public void setHeight(double height) {
	this.height = height;
    }

    public void setWidth(double width) {
	this.width = width;
    }

    public boolean isHasPotion() {
	return hasPotion;
    }

    public void setHasPotion(boolean hasPotion) {
	this.hasPotion = hasPotion;
    }

    public boolean isHasRevive() {
	return hasRevive;
    }

    public void setHasRevive(boolean hasRevive) {
	this.hasRevive = hasRevive;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAttack() {
	return attack;
    }

    public void setAttack(int attack) {
	this.attack = attack;
    }

    public int getDefense() {
	return defense;
    }

    public void setDefense(int defense) {
	this.defense = defense;
    }

    public int getStamina() {
	return stamina;
    }

    public void setStamina(int stamina) {
	this.stamina = stamina;
    }

    public int getCurrentStamina() {
	return currentStamina;
    }

    public void setCurrentStamina(int currentStamina) {
	this.currentStamina = currentStamina;
    }

    public double getHeight() {
	return height;
    }

    public double getWidth() {
	return width;
    }

    public int getGold() {
	return gold;
    }

    public void setGold(int gold) {
	this.gold = gold;
    }

    public int getXp() {
	return xp;
    }

    public void setXp(int xp) {
	this.xp = xp;
    }

    public boolean isDefending() {
	return isDefending;
    }

    public void setIsDefending(boolean isDefending) {
	this.isDefending = isDefending;
    }

    public int getMana() {
	return mana;
    }

    public void setMana(int mana) {
	this.mana = mana;
    }


}
