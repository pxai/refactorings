package io.pello.refactorings.extractmethod;

/**
 * Extract Method refactoring
 * This class is intended to be used as a refactoring playground
 * @author PELLO_ALTADILL
 */
public class UrlNormalizer {


		public String normalize (String title) {
			String url = "";
			// First we trim whitespaces
			url = url.trim();
			
			// Remove special chars
			url.replaceAll("[\\,\\.\\:\\;]+", "");
			
			// Replace white spaces with hyphens
			url.replaceAll("[\t]+", "");
			
			// lowercase everything
			url = url.toUpperCase();
			
			return url;
		}
		
		
}
