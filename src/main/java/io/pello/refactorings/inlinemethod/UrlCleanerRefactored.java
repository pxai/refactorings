package io.pello.refactorings.inlinemethod;

/**
 * Inline Method, REFACTORED
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class UrlCleanerRefactored {
		public String clean (String title) {
			return title.trim()
						.replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "")  // Replaces special chars
						.replaceAll("[\\s]+"," ")                   // Replace duplicated spaces
						.replaceAll("[\\s]","-");                   // Replace spaces with hyphen
		}
}
