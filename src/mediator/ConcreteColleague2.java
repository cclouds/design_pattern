package mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	// 消息由中介者发送
	public void send(String message) {
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println("同事2得到的消息" + message);
	}

}
