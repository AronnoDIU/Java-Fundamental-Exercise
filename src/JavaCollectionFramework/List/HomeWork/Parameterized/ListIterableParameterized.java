package JavaCollectionFramework.List.HomeWork.Parameterized;

/**
 * Implementing this interface allows an object to returns
 * object of ListIterator.
 * 
 * @author Yeasir Arafat Aronno
 *
 */

public interface ListIterableParameterized<T> {
	
	/**
	 * Returns object of ListIterator.
	 * 
	 * @return object of ListIterator
	 */
	ListIteratorParameterized<T> listIterator();
}