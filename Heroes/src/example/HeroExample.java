package example;

import java.util.ArrayList;
import java.util.List;

import people.Hero;

public class HeroExample {
	public static void main(String[] args) {
		final List<Hero> heroes = new ArrayList<>();

		final Hero spiderman = new Hero("Peter Parker", 15, "Spidey sense");
		final Hero thor = new Hero("Thor", 3000, "Lightning");

		heroes.add(spiderman);
		heroes.add(thor);

		for (final Hero hero : heroes) {
			System.out.println(hero);
		}
	}

}
