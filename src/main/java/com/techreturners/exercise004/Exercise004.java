package com.techreturners.exercise004;

import java.util.regex.Pattern;

public class Exercise004 {

	// Move the first letter of each word to the end of it, then add "ay" to the end
	// of the word.
	// Leave punctuation marks untouched.

	private static final Pattern regex = Pattern.compile("(\\w)(\\w*)");

	public String pigLatin(String str) {
		return regex.matcher(str).replaceAll("$2$1ay");
	}
}
