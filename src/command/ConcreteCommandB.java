package command;
/**
 * ConcreteCommandB类继承Command
 * @author user
 *
 */
public class ConcreteCommandB extends Command{

	
	
	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}

	//执行B命令
	@Override
	public void execute() {
		receiver.actionB();
	}

}
