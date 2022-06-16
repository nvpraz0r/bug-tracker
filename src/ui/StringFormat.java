/**
 * @Author Jon
 */

package ui;

/**
 * StringFormat class is a utility class meant to format data to be stored in the text file
 */
public class StringFormat {

    /**
     * formatWithSpaces formats the string passed to the function
     * @param s - string to be formatted
     * @param lengthOfTheSpace - length of the space between each piece of data
     * @return a formatted string
     */
    public static String formatWithSpaces(String s, int lengthOfTheSpace){
        if(s.length() < lengthOfTheSpace){
            StringBuilder sb = new StringBuilder(s);
            while(sb.length() < lengthOfTheSpace){
                sb.append(" ");
            }
            return sb.toString();
        } else {
            return s.substring(0, lengthOfTheSpace);
        }
    }
}
