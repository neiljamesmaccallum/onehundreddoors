package com.fdmgroup.onehundreddoors;

public class HundredDoorsCalculator {

	public static void openCloseDoorsIteration(int iteration, HundredDoors hundredDoors) {
		for (int i =1;iteration*i<=100;i++) {
			alternateDoor(hundredDoors.getDoors().get(iteration*i-1));
		}
	}

	public static void hundredDoorsSolve(HundredDoors hundredDoors) {
		for(int i = 1; i<=100; i++) {
			openCloseDoorsIteration(i, hundredDoors);
		}
	}
	
	public static void alternateDoor(Door door) {
		if (door.isOpen()) {
			door.setOpen(false);
		} else {
			door.setOpen(true);
		}
	}


}
