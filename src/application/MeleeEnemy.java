package application;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

/**
 * This class is an extension of the GameCharacters class. It represents a typical Enemy game character.
 * 
 * @author David Cai
 *
 */
public class MeleeEnemy extends GameCharacters {
    private Image meleeEnemyPic;

    /**
     * The constructor sets the stats(attack,defense and stamina) of the Archer object,
     * and also sets the values needed to display the image instance variable in the GUI.
     */
    public MeleeEnemy(int floor) {
	//Stat values will be changed
        setAttack(100 + (int)(Math.random() * ((5) + 1)) * floor);
        setDefense(30 + (int)(Math.random() * ((3) + 1)) * floor);
        int startStam = 400 + (int)(Math.random() * ((10) + 1)) * floor;
        setStamina(startStam);
        setCurrentStamina(startStam);
        setX(1230);
        setY(200);
        setWidth(100);
        setHeight(200);

    }

    
    public Image getEnemyPic() {
        return meleeEnemyPic;
    }

    public void setEnemyPic(Image enemy) {
        this.meleeEnemyPic = enemy;
    }

    
}
