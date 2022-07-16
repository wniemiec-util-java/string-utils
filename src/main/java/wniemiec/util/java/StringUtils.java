/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.java;

import java.util.List;

/**
 * Contains methods that perform string manipulation.
 */
public class StringUtils {
    
    //-------------------------------------------------------------------------
    //		Constructor
    //-------------------------------------------------------------------------
    private StringUtils() {
    }
    
    
    //-------------------------------------------------------------------------
    //		Methods
    //-------------------------------------------------------------------------
    /**
     * Converts elements of a list into a string by separating each element
     * with a delimiter. 
     * 
     * @param		list List to be converted
     * 
     * @return		List elements separated by the given delimiter
     * 
     * @throws		IllegalArgumentException If list or delimiter is null
     */
    public static <T> String implode(List<T> list, String delimiter) {
        validateImplodeArgs(list, delimiter);
        
        StringBuilder response = new StringBuilder();
        
        for (T p : list) {
            response.append(p);
            response.append(delimiter);
        }
        
        if (!delimiter.isEmpty()) {
            removeLastCharacter(response);
        }
        
        return response.toString();
    }

    private static <T> void validateImplodeArgs(List<T> list, String delimiter) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        
        if (delimiter == null) {
            throw new IllegalArgumentException("Delimiter cannot be null");
        }
    }

    private static void removeLastCharacter(StringBuilder response) {
        if (response.length() <= 1) {
            return;
        }

        response.deleteCharAt(response.length()-1);
    }

    /**
     * Converts first character of a text to uppercase letter and convert to 
     * lowercase all other characters (if any).
     * 
     * @param		text Text to be capitalized
     * 
     * @return		Capitalized text
     */
    public static String capitalize(String text) {
        validateCapitalizeArg(text);

        if (text.isEmpty()) {
            return text;
        }

        if (text.length() == 1) {
            return text.toUpperCase();
        }

        StringBuilder capitalizedText = new StringBuilder();

        for (String term : text.split(" ")) {
            String firstCharacter = term.substring(0, 1);
            String remainingText = term.substring(1);

            capitalizedText.append(firstCharacter.toUpperCase());
            capitalizedText.append(remainingText.toLowerCase());
            capitalizedText.append(" ");
        }

        removeLastCharacter(capitalizedText);

        return capitalizedText.toString();
    }

    private static void validateCapitalizeArg(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
    }

    /**
     * Converts the first character of a string to an uppercase letter and 
     * concatenate it with remaining letters.
     * 
     * @param		text Text to be capitalized
     * 
     * @return		Capitalized text
     */
    public static String capitalizeOnlyFirstLetter(String text) {
        validateCapitalizeArg(text);

        if (text.isEmpty()) {
            return text;
        }

        if (text.length() == 1) {
            return text.toUpperCase();
        }

        String firstCharacter = text.substring(0, 1);
        String remainingText = text.substring(1);

        return firstCharacter.toUpperCase() + remainingText;
    }
}
