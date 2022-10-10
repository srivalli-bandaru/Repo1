package com;

public class Building {

	static int number ;
	static String name ;
	//constructor
	public Building() {
		number = 10;
		name = "My home";
		System.out.println("This is constructor");
	}
	public static void setNumberOfBedrooms(int no) {
		System.out.println("Number of Bedrooms are "+no);
	}
	public static void setNumberOfLobby(int no) {
		System.out.println("Number of Lobby are"+no);
	}
}
