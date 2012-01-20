/**
 * 
 */
package com.samples.utils;

/**
 * Random generator.
 * @author FDELORME
 *
 */
public class RandomGenerator {
	/**
	 * List of characters set to generate string.
	 * <ul>
	 * 	<li>NUMERIC: only numerical characters (0-9)</li>
	 * 	<li>NUMERIC: only alphabetical characters (A-Z)</li>
	 * 	<li>NUMERIC: only alpha-numerical characters (0-9A-Z)</li>
	 * 	<li>NUMERIC: all characters (ASCII)</li>
	 * </ul>
	 * @author FDELORME
	 *
	 */
	public enum StringGenType {
		NUMERIC,
		ALPHABETIC,
		ALPHANUMERIC,
		FULL
	};
	/**
	 * Generate a String with random characters, based on <code>StringGenType</code> list of types of characters set.
	 * (limited to 32767 characters).
	 * @param nbChar number of characters
	 * @param type type of characters set (see <code>StringGentype</code>)
	 * @return
	 */
	public static String getString(int nbChar, RandomGenerator.StringGenType type){
		String value="";
		String ref="";
		switch (type){
			case NUMERIC:
				ref="0123456789";
				break;
			case ALPHABETIC:
				ref="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				break;
			case ALPHANUMERIC:
				ref="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				break;
			case FULL:
				for(int i=32;i<127;i++){
					ref+=i;
				}
				break;
		}
		for(int index=1;index<=nbChar;index++){
			value+=ref.charAt((int)(Math.random()*ref.length()));
		}
		return value;
	}
}
