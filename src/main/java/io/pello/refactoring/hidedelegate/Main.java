package io.pello.refactoring.hidedelegate;

import io.pello.refactoring.hidedelegate.refactored.Die;
import io.pello.refactoring.hidedelegate.refactored.Player;

/**
 * Hide Delegate
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Main {
	private Player player;
	private Die die;
	
	public Main () {
		init();
	}
	
	private void init () {
		player = new Player();
		die = new Die();
	}
	
	public int roll () {
		return die.roll();
	}
}
