package String;

/**
 * 
 * @author Aronno
 *
 */

// A bubble sort for String.
public class SortString {
	static String arr[] = { "Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid",
			"of", "their", "country"

	};

	public static void main(String[] args) {

		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				/*
				 * compareTo( ) takes into account uppercase and lowercase letters. The word
				 * "Now" came out before all the others because it begins with an uppercase
				 * letter, which means it has a lower value in the ASCII character set.
				 */
				if (arr[i].compareTo(arr[j]) < 0) { 
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}

				// Instead of compareTo()... for Ignoring UpperCase & LowerCase
				
//				if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
//					String t = arr[j];
//					arr[j] = arr[i];
//					arr[i] = t;
//				}
			}
			System.out.println(arr[j]);
		}

	}

}