package s01.StrategyPattern;

public class BackDoor implements IStrategy{

	@Override
	public void operate() {
		// 开后门
		System.out.println("求开后门");
	}

}
