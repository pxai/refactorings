package io.pello.refactorings.encapsulate;

/**
 * Rename variables and methods
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class Customer {

		String name;
		int id;
		
		public Customer () {
			init();
		}
		
		public void init () {
			name = "Eugene Krabs";
			id = 42;
		}
		
		public String toString() {
			return id + ":" + name;  
		}

}
