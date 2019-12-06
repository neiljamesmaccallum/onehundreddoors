package com.fdmgroup.onehundreddoors;

public class OnehundredDoorsApp {

	public static void alternateDoor(Door door) {
		if (door.isOpen()) {
			door.setOpen(false);
		} else {
			door.setOpen(true);
		}
	}

}
