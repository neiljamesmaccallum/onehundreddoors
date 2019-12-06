package com.fdmgroup.onehundreddoors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class doorAlternatorTests {
	
	@Test
	void test_AlternateDoorOpensAClosedDoor(){
		Door door = new Door(false);
		OnehundredDoorsApp.alternateDoor(door);
		assertTrue(door.isOpen());
	}
	
	@Test
	void test_AlternateDoorClosesAnOpenDoor() {
		Door door = new Door(true);
		OnehundredDoorsApp.alternateDoor(door);
		assertFalse(door.isOpen());
	}

	@Test
	void test_AlternateDoorProducesTheInitialResultWhenIncurredTwice() {
		boolean isOpenInitially = false;
		Door door = new Door(isOpenInitially);
		OnehundredDoorsApp.alternateDoor(door);
		OnehundredDoorsApp.alternateDoor(door);
		assertEquals(isOpenInitially, door.isOpen());
	}
}
