package application;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

/**
 * This class is an extension of the GameCharacters class. It represents a
 * typical Enemy game character.
 * 
 * @author David Cai
 *
 */
public class BossEnemy extends GameCharacters {
    private Image bossEnemyPic;

    /**
     * The constructor sets the stats(attack,defense and stamina) of the MeleeEnemy
     * object, and also sets the values needed to display the image instance
     * variable in the GUI.
     */
    public BossEnemy(int floor) {
	// Stat values will be changed
	setAttack(150 + 1 + (int) (Math.random() * ((4) + 1)) * floor);
	setDefense(60 + 1 + (int) (Math.random() * ((2) + 1)) * floor);
	int startStam = 500 + 20 * floor;
	setStamina(startStam);
	setCurrentStamina(startStam);
	setX(1230);
	setY(200);
	setWidth(100);
	setHeight(200);
	setType("Boss");

    }

    /**
     * The method allows us to get the image instance variable of the MeleeEnemy.
     * 
     * @return meleeEnemyPic Image of the MeleeEnemy character object.
     */
    public Image getEnemyPic() {
	return bossEnemyPic;
    }

    /**
     * This method sets the image of the MeleeEnemy character.
     * 
     * @param enemy Image of the MeleeEnemy character.
     */
    public void setEnemyPic(Image enemy) {
	this.bossEnemyPic = enemy;
    }

}