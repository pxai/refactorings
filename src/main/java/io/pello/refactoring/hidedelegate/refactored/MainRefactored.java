package io.pello.refactoring.hidedelegate.refactored;


/**
 * Hide Delegate
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class MainRefactored {
	private Player player;
	
	public MainRefactored () {
		init();
	}
	
	private void init () {
		player = new Player();
	}
	
	public int roll () {
		return player.roll();
	}
}
