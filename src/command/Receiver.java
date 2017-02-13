package command;
/**
 * Receiver类：知道如何实施与执行一个与请求相关的操作，
 * 任何类都可能作为一个接收者
 * @author user
 *
 */
public class Receiver {
	//A请求
	public void actionA(){
		System.out.println("执行A请求！");
	}
	
	//B请求
	public void actionB(){
		System.out.println("执行B请求！");
	}
	

}
