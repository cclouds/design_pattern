package command;
/**
 * 测试类：命令模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Invoker i = new Invoker();
		Receiver r = new Receiver();
		Command c1 = new ConcreteCommandA(r);
		Command c2 = new ConcreteCommandB(r);
		
		i.setCommand(c1);
		i.executeCommand();
		
		i.setCommand(c2);
		i.executeCommand();
		
	}

}
