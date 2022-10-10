package com;

interface Animal {
    public String cry(String sound);

}
	public class AnimalFarm {

	    public String Hello(Animal animal, String sound) {
	        return animal.cry(sound);
	    }

	    public static void main(String[] args) throws Exception {

	        AnimalFarm animalFarm = new AnimalFarm();

	        Animal tiger = (sound) -> "Hi, Tiger " + sound;
	        System.out.println(animalFarm.Hello(tiger, "ROARR"));

	    }
	}
