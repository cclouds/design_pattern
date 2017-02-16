package mediator;
/**
 * 中介者模式
 * Mediator：抽象中介者类
 * @author user
 *
 */
public abstract class Mediator {
	//发送消息
	public abstract void send(String message,Colleague colleague);

}
