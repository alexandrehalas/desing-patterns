package patterns.strategy.miniducksimulator.duck.behaviors.quack;

import patterns.strategy.miniducksimulator.duck.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {

	public void quack() {
		System.out.println("Squeak");
	}

}
