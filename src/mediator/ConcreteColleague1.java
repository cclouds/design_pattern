package mediator;

/**
 * ConcreteColleague1类具体同事对象
 * 
 * @author user
 *
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	// 消息由中介者发送
	public void send(String message) {
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println("同事1得到的消息" + message);
	}

}
