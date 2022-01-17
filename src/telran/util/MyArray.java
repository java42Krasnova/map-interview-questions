package telran.util;

import java.util.HashMap;


//all methods should be written with complexity O[1]
public class MyArray {
	private static final Integer DEFAULT_VALUE = 0;
	/**
	 * creates myArray obj with a given length all elements are set in 0
	 * 
	 * @param length
	 */
	private HashMap<Integer, Integer> array =  new HashMap<>(); 
	int length;
	
	public MyArray(int length) {
		this.length = length;
		array.put(length, DEFAULT_VALUE);
	}
	/**
	 * sets a given value in all array's elements
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		array =  new HashMap<>();
		array.put(length, value);
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
	if(!array.containsKey(index)) {
		return array.get(length);
	}
	return array.get(index);
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
		 array.put(index, value);
	}
}
