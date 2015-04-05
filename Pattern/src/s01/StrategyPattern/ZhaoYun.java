package s01.StrategyPattern;

public class ZhaoYun {
	public static void main(String[] args) {
		Context context;
		System.out.println("----------�յ������ʱ��𿪵�һ��----------");
		context = new Context(new BackDoor());
		context.operate();
		
		System.out.println("----------�𿪵ڶ���----------");
		context = new Context(new GiveGreenLight());
		context.operate();
		
		System.out.println("----------�𿪵�����----------");
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
