package s02.Proxy;

/**
 * 王婆代理KindWomen，默认代理潘金莲<br/>
 * 代理的意思是，表面是是由王婆做事，实际上还是被代理的对象在做事
 * @author Administrator
 *
 */
public class WangPo implements KindWomen{
	private KindWomen kindWomen;
	
	WangPo(){
		this.kindWomen = new PanJinLian();
	}
	
	WangPo(KindWomen kindWomen){
		this.kindWomen = kindWomen;
	}

	@Override
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan();
		
	}

	@Override
	public void happyWithMan() {
		this.kindWomen.happyWithMan();
	}
	
	
}
