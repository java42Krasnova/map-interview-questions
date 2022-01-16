package telran.util;

import java.util.HashMap;
import java.util.TreeMap;

//all methods should be written with complexity O[1]
public class MyArray {
//TODO encapsulation
	/**
	 * creates myArray obj with a given length all elements are set in 0
	 * 
	 * @param length
	 */
	// HashMap<Integer, Object> myArray = new HashMap<>();
	HashMap<Integer, Integer> myArray = new HashMap<>();
	// TreeMap<Integer, Integer> myArray = new TreeMap<>();
	//Integer[] myArray;

	public MyArray(int length) {
		// TODO
		//myArray = new Integer[length];
		for (int i = 0; i < length - 1; i++) {
			 myArray.put(i, 0);
			//myArray[i] = 0;
		}
	}

	/**
	 * sets a given value in all array's elements
	 * 
	 * @param value
	 */
	public void setValue(int value) {
		// TODO
		myArray.replaceAll((key, val) -> val = value);
//		for (int i = 0; i < myArray.length; i++) {
//			
//			myArray[i] = value;
//		}
		}
	

	/**
	 * 
	 * @param index
	 * @returns value at a given index value throws ArrayIndexOutOfBoundsException
	 *          in case of wrong index
	 */
	public int getValueAt(int index) {
		// TODO
	if(index < 0 || index >= myArray.size()) {
	//	if (index < 0 || index >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		//return myArray[index];
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
		// TODO
		 if(index < 0 || index >= myArray.size()) {
		//if (index < 0 || index >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		//myArray[index] = value;
		 myArray.replace(index, value);
	}
}
