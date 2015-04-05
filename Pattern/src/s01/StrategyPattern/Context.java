package s01.StrategyPattern;

public class Context {
	private IStrategy strategy;
	
	Context(IStrategy strategy){
		this.strategy = strategy;
	}

	public void operate(){
		this.strategy.operate();
	}
}
