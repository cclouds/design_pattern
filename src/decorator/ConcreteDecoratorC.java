package decorator;

/**
 * 具体装饰C类
 * 
 * @author user
 *
 */
public class ConcreteDecoratorC extends Decorator {
	public void Operation() {
		super.Operation();
		C();
		System.out.println("具体装饰对象C的操作");
		super.Operation();
	}
	
	public void C(){
		System.out.println("C特有的方法");
	}

}
