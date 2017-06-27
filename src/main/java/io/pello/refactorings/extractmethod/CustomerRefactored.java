package io.pello.refactorings.extractmethod;

/**
 * Rename variables and methods
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class CustomerRefactored {

		private String name;
		private int id;
		
		public CustomerRefactored () {
			init();
		}
		
		private void init () {
			setName("Eugene Krabs");
			setId(42);
		}
		
		public String toString() {
			return getId() + ":" + getName();  
		}

		String getName() {
			return name;
		}

		void setName(String name) {
			this.name = name;
		}

		int getId() {
			return id;
		}

		void setId(int id) {
			this.id = id;
		}

}
