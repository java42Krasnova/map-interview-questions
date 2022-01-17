package telran.util;

import java.util.HashMap;


//all methods should be written with complexity O[1]
public class MyArray {
	/**
	 * creates myArray obj with a given length all elements are set in 0
	 * 
	 * @param length
	 */
	private HashMap<Integer, Integer> myArray = new HashMap<>();
	int length;
	public MyArray(int length) {
//		
		this.length = length;
		myArray.put(length, 0);
	}
	/**
	 * sets a given value in all array's elements
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		myArray.put(length, value);
		}
	/**
	 * 
	 * @param index
	 * @returns value at a given index value throws ArrayIndexOutOfBoundsException
	 *          in case of wrong index
	 */
	public int getValueAt(int index) {

		if(index < 0 || index >= length) {
			throw new ArrayIndexOutOfBoundsException();
		}
	if(index > 0 &&  index < length && !myArray.containsKey(index) ) {
		return myArray.get(length);
	}
	return myArray.get(index);
	}

	/**
	 * sets given value at a given index
	 * 
	 * @param index
	 * @param value throws ArrayIndexOutOfBoundsException in case of wrong index
	 * 
	 */
	public void setVAlueAt(int index, int value) {

		 if(index < 0 || index >= length) {
				throw new ArrayIndexOutOfBoundsException();
			}
		 
		 myArray.putIfAbsent(index, value);
	}
}
