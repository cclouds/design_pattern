package chain_of_responsibility;
/**
 * Handler类：定义一个处理请示的接口
 * @author user
 *
 */
public abstract class Handler {
	
	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}
	
    //设置继承者
	public  void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	//处理请求的抽象方法
	public abstract void HandleRequest(int request);
	
	

}
