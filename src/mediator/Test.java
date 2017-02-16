package mediator;
/**
 * 测试类
 * 中介者模式
 * @author user
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//中介者对象
		ConcreteMediator m = new ConcreteMediator();
		
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		c1.send("吃饭了吗");
		c2.send("吃过了");
	}

}
