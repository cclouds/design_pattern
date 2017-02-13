package chain_of_responsibility;
/**
 * ConcreteHandler1类：具体处理者类，处理它所负责的请求
 * 可以访问它的后继者，如果可以处理该请求就处理之，否则就将该
 * 请求转发给它的后继者
 * @author user
 *
 */
public class ConcreteHandler1 extends Handler{

	@Override
	public void HandleRequest(int request) {
		if(request >= 0 && request < 10){
			System.out.println("ConcreteHandler1处理改请求"+request);
		}else if(handler !=null ){
//			System.out.println(handler);
			//转移到下一位
			handler.HandleRequest(request);
		}
		
	}

}
