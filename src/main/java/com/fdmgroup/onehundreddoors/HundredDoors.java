package com.fdmgroup.onehundreddoors;

import java.util.ArrayList;
import java.util.List;

public class HundredDoors {
	
	private List<Door> doors;

	public HundredDoors() {
		doors = new ArrayList<>();
		for (int i =0;i<100;i++) {
			doors.add(new Door(false));
		}
	}

	public List<Door> getDoors() {
		return doors;
	}

}
