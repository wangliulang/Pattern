package s01.StrategyPattern;

public class ZhaoYun {
	public static void main(String[] args) {
		Context context;
		System.out.println("----------刚到吴国的时候拆开第一个----------");
		context = new Context(new BackDoor());
		context.operate();
		
		System.out.println("----------拆开第二个----------");
		context = new Context(new GiveGreenLight());
		context.operate();
		
		System.out.println("----------拆开第三个----------");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
