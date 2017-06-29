package io.pello.refactorings.extractmethod.refactored;

/**
* Refactored version
*/
public class UrlNormalizer {


		public String normalize (String title) {
			String url = trimSpaces(title);
			
			url = removeSpecialChars(url);
			
			url = replaceSpaces(url);
			
			// lowercase everything
			url = url.toLowerCase();
			
			return url;
		}

		private String replaceSpaces(String url) {
			// Replace white spaces with hyphens
			String spacesReplaced = "";
			for (int i = 0; i< url.length();i++) {
				if (url.charAt(i) == ' ') {
					spacesReplaced += "-";
				} else {
					spacesReplaced += url.charAt(i);
				}
			}
			url = spacesReplaced;
			return url;
		}

		private String removeSpecialChars(String url) {
			// Remove special chars
			String specialRemoved = "";
			for (int i = 0; i< url.length();i++) {
				if (url.charAt(i) != ',' && url.charAt(i) != ':' && url.charAt(i) != '.' && url.charAt(i) != '?') {
					specialRemoved += url.charAt(i);
				} 
			}
			
			url = specialRemoved;
			return url;
		}

		private String trimSpaces(String title) {
			String url = "";
			url = title.trim();
			return url;
		}
		
		
}
