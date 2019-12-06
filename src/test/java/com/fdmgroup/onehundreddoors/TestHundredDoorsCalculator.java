package com.fdmgroup.onehundreddoors;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHundredDoorsCalculator {

	private HundredDoors hundredDoors;

	@BeforeEach
	void init() {
		hundredDoors = new HundredDoors();
	}

	@Test
	void test_openCloseDoorsIteration_OpensFirstDoorOnIteration_One() {
		HundredDoorsCalculator.openCloseDoorsIteration(1, hundredDoors);
		assertTrue(hundredDoors.getDoors().get(0).isOpen());
	}

	@Test
	void test_openCloseDoorsIteration_OpensAllOneHundredDoors() {
		HundredDoorsCalculator.openCloseDoorsIteration(1, hundredDoors);
		for (int i = 0; i < 100; i++) {
			assertTrue(hundredDoors.getDoors().get(i).isOpen());
		}
	}

	@Test
	void test_openCloseDoorsIteration_OpensEveryOtherDoor_OnIterationTwo() {
		HundredDoorsCalculator.openCloseDoorsIteration(2, hundredDoors);
		for (int i = 1; 2 * i <= 100; i++) {
			assertTrue(hundredDoors.getDoors().get(2 * i - 1).isOpen());
		}
	}

	@Test
	void test_openCloseDoorsIteration_DoesNotOpenNonEvenDoors_OnIterationTwo() {
		HundredDoorsCalculator.openCloseDoorsIteration(2, hundredDoors);
		for (int i = 1; 2 * i <= 100; i++) {
			assertFalse(hundredDoors.getDoors().get(2 * i - 2).isOpen());
		}
	}

	@Test
	void test_openCloseDoorsIteration_HasFirstDoorOpenAndSecondDoorClosedAfterIterationOneAndTwo() {
		HundredDoorsCalculator.openCloseDoorsIteration(1, hundredDoors);
		HundredDoorsCalculator.openCloseDoorsIteration(2, hundredDoors);
		for (int i = 1; 2 * i <= 100; i++) {
			assertTrue(hundredDoors.getDoors().get(2 * 1 - 2).isOpen());
			assertFalse(hundredDoors.getDoors().get(2 * i - 1).isOpen());
		}
	}
	


}
