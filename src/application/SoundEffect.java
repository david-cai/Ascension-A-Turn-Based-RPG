package application;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundEffect {
	private MediaPlayer mediaPlayer;

	
	// Battle sound effect//
	/**
	 * This method plays the sword swing sound effect.
	 */
	public void swingSound() {
		String musicFile = "./src/swing2.wav";
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.1);
	}

	/**
	 * This method plays the poof sound effect when magic is used.
	 */
	public void magicSound() {
		String musicFile = "./src/fireball.mp3";
		Media sound2 = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound2);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.06);
	}
	
	/**
	 * This method plays a sound when the enemy is killed.
	 */
	public void enemyDeathSound() {
		String musicFile = "./src/enemyDeath.wav";
		Media sound3 = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound3);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.5);		
	}
	
	
	// Shop sound effect//
	/**
	 * This method plays a sound when the player buy or sell an item. 
	 */
	public void moneySound() {
		String musicFile = "./src/goldSound.wav";
		Media sound = new Media(new File(musicFile).toURI().toString());		
	
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.3);		
	}
	
	// Event sound effect//
	/**
	 * This method creates the chest opening sound effect. 
	 */
	
	public void openChestSound() {
		String musicFile = "./src/chestOpening.wav";
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.8);		
	}
	
	// General sound effect//
	
	/**
	 * This method plays a sound when there is an error.
	 */
	public void errorSound() {
		String musicFile = "./src/error.wav";
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.6);		
	}
	/**
	 * Method allows us to play the same sound when buttons are pressed
	 */
	public void transitionSound() {
	    String musicFile = "./src/startSound.wav";
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.play();
		mediaPlayer.setVolume(0.1);
	}

}
