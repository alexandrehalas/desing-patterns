package patterns.strategy.miniducksimulator;

import patterns.strategy.miniducksimulator.duck.Duck;
import patterns.strategy.miniducksimulator.duck.MallardDuck;
import patterns.strategy.miniducksimulator.duck.ModelDuck;
import patterns.strategy.miniducksimulator.duck.behaviors.fly.FlyRocketPowered;
import patterns.strategy.miniducksimulator.duck.behaviors.quack.Quack;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.setQuackBehavior(new Quack());
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
