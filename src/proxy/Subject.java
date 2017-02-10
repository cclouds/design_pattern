package proxy;
/**
 * 代理模式，定义了RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方使用Proxy
 * @author user
 *
 */
public abstract class Subject {
	
    public abstract void requst();
    
}
