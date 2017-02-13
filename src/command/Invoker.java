package command;
/**
 * Invoker类：要求改命令执行这个请求
 * @author user
 *
 */
public class Invoker {
	
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
    public void executeCommand(){
    	
    	command.execute();
    	
    }
	
}
