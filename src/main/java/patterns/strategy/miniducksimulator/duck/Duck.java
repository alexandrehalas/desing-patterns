package patterns.strategy.miniducksimulator.duck;

import patterns.strategy.miniducksimulator.duck.behaviors.FlyBehavior;
import patterns.strategy.miniducksimulator.duck.behaviors.QuackBehavior;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	
	protected FlyBehavior flyBehavior;

	public abstract void display();
	
	public void performQuack() {

		quackBehavior.quack();
	}

	public void performFly() {

		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
