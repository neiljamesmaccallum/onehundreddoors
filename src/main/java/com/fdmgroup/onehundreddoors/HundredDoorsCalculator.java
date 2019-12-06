package com.fdmgroup.onehundreddoors;

public class HundredDoorsCalculator {

	public static void openCloseDoorsIteration(int iteration, HundredDoors hundredDoors) {
		for (int i =1;iteration*i<=100;i++) {
			OnehundredDoorsApp.alternateDoor(hundredDoors.getDoors().get(iteration*i-1));
		}
	}

	public static void hundredDoorsSolve(HundredDoors hundredDoors) {
		for(int i = 1; i<=100; i++) {
			openCloseDoorsIteration(i, hundredDoors);
		}
	}

}
