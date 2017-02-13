package chain_of_responsibility;
/**
 * ConcreteHandler3类：具体处理者类，处理它所负责的请求
 * @author user
 *
 */
public class ConcreteHandler3 extends Handler{

	@Override
	public void HandleRequest(int request) {
		
		if(request >= 20 && request <30 ){
			System.out.println("ConcreteHandler3处理改请求"+request);
		}else{
			
			System.out.println(request);
			
		}
		
	}

}
