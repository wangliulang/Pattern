package s02.Proxy;

/**
 * ���Ŵ���KindWomen��Ĭ�ϴ����˽���<br/>
 * �������˼�ǣ������������������£�ʵ���ϻ��Ǳ�����Ķ���������
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
