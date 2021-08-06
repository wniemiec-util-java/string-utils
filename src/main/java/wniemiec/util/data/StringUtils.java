/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.data;

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
		if (list == null)
			throw new IllegalArgumentException("List cannot be null");
		
		if (delimiter == null)
			throw new IllegalArgumentException("Delimiter cannot be null");
		
		StringBuilder response = new StringBuilder();
		
		for (T p : list) {
			response.append(p);
			response.append(delimiter);
		}
		
		// Removes last delimiter
		if (response.length() > 1) {
			response.deleteCharAt(response.length()-1);
		}
		
		return response.toString();
	}
}
