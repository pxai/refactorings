package io.pello.refactorings.removecontrolflag;

/**
 * Remove Control Flag
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class FriendsRefactoredStep2 {
	private String[] friends;
	
	public FriendsRefactoredStep2 (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {
		for (int i = 0;i< friends.length; i++) 
			if (friends[i].equals(friend)) 
				return i;
		
		return -1;
	}
}
