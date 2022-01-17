package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayTest {
	private static final int LENGTH = 100;
	MyArray myArray100 = new MyArray(LENGTH);

	@BeforeEach
	void setUp() throws Exception {
		myArray100.setValue(88);
	}

	@Test
	void testMyArray() {
		MyArray array = new MyArray(LENGTH);
		assertEquals(0, array.getValueAt(66));
	}

	@Test
	void testSetValue() {
		myArray100.setValue(77);
		assertEquals(77, myArray100.getValueAt(84));
		assertNotEquals(88, myArray100.getValueAt(33));
	}

	@Test
	void testGetValueAt() {
		boolean fl = false;
		try {
			int valueAt = myArray100.getValueAt(6);
			assertEquals(88, valueAt);
			valueAt = myArray100.getValueAt(LENGTH + LENGTH);
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
			myArray100.setVAlueAt(19, 32);
			assertEquals(32, myArray100.getValueAt(19));
			assertEquals(88, myArray100.getValueAt(24));
			myArray100.setVAlueAt(15, 77);
			assertEquals(77, myArray100.getValueAt(15));
			myArray100.setValue(33);
			assertEquals(33, myArray100.getValueAt(15));
			myArray100.setValue(-LENGTH);
		} catch (ArrayIndexOutOfBoundsException e) {
			fl = true;
		}
	}
}
