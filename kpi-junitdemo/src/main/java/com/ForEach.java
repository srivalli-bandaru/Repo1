package com;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestForEach {
	void print(List test);
}
public class ForEach {

	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		
		gamesList.add("Hockey");
		gamesList.add("Football");
		gamesList.add("Ludo");
		gamesList.add("Carroms");
		for(int i=0;i<gamesList.size();i++) {
			System.out.println(gamesList.get(i));
		}
		System.out.println("Iterating by passing lambda expression");
		gamesList.forEach(games -> System.out.println(games));
		TestForEach tfe=games -> System.out.println(games);
	}
}
