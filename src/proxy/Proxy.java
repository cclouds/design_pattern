package proxy;
/**
 * Proxy类。保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口
 * 这样代理就可以代替实体
 * @author user
 *
 */

public class Proxy extends Subject{

	
	RealSubject realSubject;
	
	@Override
	public void requst() {
		if(null == realSubject){
			realSubject = new RealSubject();
		}
		realSubject.requst();
		
	}
	

}
