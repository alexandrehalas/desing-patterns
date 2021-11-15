package patterns.strategy.miniducksimulator.duck;

import patterns.strategy.miniducksimulator.duck.behaviors.fly.FlyNoWay;
import patterns.strategy.miniducksimulator.duck.behaviors.quack.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}
