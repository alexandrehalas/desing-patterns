package patterns.strategy.miniducksimulator.duck.behaviors.quack;

import patterns.strategy.miniducksimulator.duck.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("Quack");
	}

}
