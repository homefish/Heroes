package example;

import java.util.ArrayList;
import java.util.List;

import people.Hero;

public class HeroExample {
	public static void main(String[] args) {
		final List<Hero> heroes = new ArrayList<>();

		final Hero spiderman = new Hero("Spiderman", 15, "Spidey sense");
		final Hero thor = new Hero("Thor", 3000, "Lightning");
		final Hero susanStorm = new Hero("Susan Storm", 23, "Invisibility");
		final Hero hulk = new Hero("Hulk", 35, "Superhuman strength");

		heroes.add(spiderman);
		heroes.add(thor);
		heroes.add(susanStorm);

		for (final Hero hero : heroes) {
			System.out.println(hero);
		}
	}

}
