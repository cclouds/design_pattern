package proxy;
/**
 * RealSubject类，定义Proxy所代表的真实实体
 * @author user
 *
 */
public class RealSubject extends Subject{

	@Override
	public void requst() {
		
		System.out.println("真实的请求");
		
	}

}
