package s02.Proxy;

public class XiMenQin {
	public static void main(String[] args){
		WangPo wangPo = new WangPo();
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
		
		JiaShi jiaShi = new JiaShi();
		wangPo = new WangPo(jiaShi);
		wangPo.makeEyesWithMan();
		wangPo.happyWithMan();
	}
}
