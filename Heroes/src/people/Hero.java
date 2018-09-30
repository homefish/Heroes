package people;

public class Hero extends Person {
	private final String power;

	public Hero(final String name, final int age, final String power) {
		super(name, age);
		this.power = power;
	}

	public String getPower() {
		return power;
	}

	@Override
	public String toString() {
		return "Hero [name=" + getName() + ", age=" + getAge() + ", power=" + power + "]";
	}
	
}
