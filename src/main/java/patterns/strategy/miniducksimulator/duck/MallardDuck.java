package patterns.strategy.miniducksimulator.duck;

import patterns.strategy.miniducksimulator.duck.behaviors.fly.FlyWithWings;
import patterns.strategy.miniducksimulator.duck.behaviors.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		System.out.println("I'm a mallard duck");
	}

}
