package patterns.strategy.miniducksimulator.duck.behaviors.fly;

import patterns.strategy.miniducksimulator.duck.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("I'm flying.");
	}

}
