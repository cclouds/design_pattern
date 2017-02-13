package command;
/**
 * Command类：用来声明执行操作的接口
 * @author user
 *
 */
public abstract class Command {
	
	 protected Receiver receiver;

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	 
	public abstract void execute();

}
