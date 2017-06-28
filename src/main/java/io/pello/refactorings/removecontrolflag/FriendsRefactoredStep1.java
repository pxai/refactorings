package io.pello.refactorings.removecontrolflag;

/**
 * Remove Control Flag
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class FriendsRefactoredStep1 {
	private String[] friends;
	
	public FriendsRefactoredStep1 (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {

		int i = 0;
		
		while (i < friends.length ) {
			
			  if (friends[i].equals(friend)) {
			    break;
			  }
			  i++;
			}
		
		if (i == friends.length) {
			return -1;
		} else {
			return i;
		}
	}
}
