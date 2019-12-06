package com.fdmgroup.onehundreddoors;

public class HundredDoorsCalculator {

	public static void openCloseDoorsIteration(int iteration, HundredDoors hundredDoors) {
		for (Door door : hundredDoors.getDoors()) {
			OnehundredDoorsApp.alternateDoor(door);
		}
		if (iteration == 2) {
			for (int i = 1; 2 * i <= 100; i++) {
				OnehundredDoorsApp.alternateDoor(hundredDoors.getDoors().get(2 * i - 2));
			}
		}
	}

}
