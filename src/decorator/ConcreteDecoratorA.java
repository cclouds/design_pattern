package decorator;

/**
 * 具体装饰A类
 * 
 * @author user
 *
 */
public class ConcreteDecoratorA extends Decorator {
	public void Operation() {
		
		super.Operation();
		A();
		System.out.println("具体装饰对象A的操作");
		super.Operation();
	}
	
	public void A(){
		System.out.println("A特有的方法");
	}
	

}
