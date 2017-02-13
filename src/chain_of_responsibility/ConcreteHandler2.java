package chain_of_responsibility;
/**
 * ConcreteHandler2类：具体处理者类，处理它所负责的请求
 * @author user
 *
 */
public class ConcreteHandler2 extends Handler{

	@Override
	public void HandleRequest(int request) {
		
		if(request >= 10 && request <20 ){
			System.out.println("ConcreteHandler2处理改请求"+request);
		}else if(handler != null){
			
			handler.HandleRequest(request);
			
		}
		
	}

}
