package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

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
		Instant now = Instant.now();
		myArray100.setValue(77);
		assertEquals(77, myArray100.getValueAt(64));
	}

	@Test
	void testGetValueAt() {
		boolean fl = false;
		try {
			Instant now = Instant.now();
			int valueAt = myArray100.getValueAt(6);
			System.out.printf("time for 100  is %d ", ChronoUnit.MICROS.between(now, Instant.now()));
			assertEquals(88, valueAt);
			now = Instant.now();
			valueAt = myArray1000000.getValueAt(66999);
			System.out.printf("time for 10000  is %d ", ChronoUnit.MICROS.between(now, Instant.now()));

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
			Instant now = Instant.now();
			myArray100.setVAlueAt(15, 77);
			System.out.printf("\ntime for 100  is %d ", ChronoUnit.MICROS.between(now, Instant.now()));
			assertEquals(77, myArray100.getValueAt(15));
			now = Instant.now();
			myArray1000000.setVAlueAt(66999,88);
			System.out.printf("\ntime for 10000  is %d ", ChronoUnit.MICROS.between(now, Instant.now()));

			myArray100.setValue(-LENGTH);
		} catch (ArrayIndexOutOfBoundsException e) {
			fl = true;
		}
	}

}
