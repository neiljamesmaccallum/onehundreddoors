package com.fdmgroup.onehundreddoors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHundredDoorsCalculatorSolution {
	
	

	@Test
	void test_HundredDoorsSolver_ProducesCorrectResult() {
		HundredDoors hundredDoors = new HundredDoors();
		HundredDoorsCalculator.hundredDoorsSolve(hundredDoors);
		HundredDoors expectedHundredDoors = new HundredDoors();
		for(int i=1;i*i<=100;i++) {
			expectedHundredDoors.getDoors().get(i).setOpen(true);
		}
		for(int i=0;i<100;i++) {
			assertEquals(expectedHundredDoors.getDoors().get(i).isOpen(), hundredDoors.getDoors().get(i).isOpen());
		}
	}
}
