package command;
/**
 * ConcreteCommandA类继承Command类
 * @author user
 *
 */
public class ConcreteCommandA extends Command{

	
	
	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}

	//执行A命令
	@Override
	public void execute() {
		receiver.actionA();
	}

}
