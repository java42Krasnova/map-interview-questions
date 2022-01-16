package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayTest {
	private static final int LENGTH = 100;
	private static final int LENGTH2 = 1000000;
	MyArray myArray100 = new MyArray(LENGTH);
	MyArray myArray1000000 = new MyArray(LENGTH2);

	@BeforeEach
	void setUp() throws Exception {
		myArray100.setValue(88);
		myArray1000000.setValue(99);
	}

	@Test
	void testMyArray() {
		MyArray array = new MyArray(LENGTH);
		assertEquals(0, array.getValueAt(66));
	}

	@Test
	void testSetValue() {
		myArray100.setValue(77);
		assertEquals(77, myArray100.getValueAt(64));
	}

	@Test
	void testGetValueAt() {
		boolean fl = false;
		try {
			int valueAt = myArray100.getValueAt(6);
			assertEquals(88, valueAt);
			valueAt = myArray1000000.getValueAt(66999);
			valueAt = myArray100.getValueAt(LENGTH + LENGTH);
			assertEquals(88, valueAt);
		} catch (ArrayIndexOutOfBoundsException e) {
			fl = true;
		}
	}

	@Test
	void testSetVAlueAt() {
		boolean fl = false;
		try {
			myArray100.setVAlueAt(15, 77);
			assertEquals(77, myArray100.getValueAt(15));
			myArray1000000.setVAlueAt(66999,88);
			myArray100.setValue(-LENGTH);
		} catch (ArrayIndexOutOfBoundsException e) {
			fl = true;
		}
	}
}
