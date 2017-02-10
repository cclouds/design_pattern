package decorator;

/**
 * 具体装饰A类
 * 
 * @author user
 *
 */
public class ConcreteDecoratorA extends Decorator {
	public void operation() {
		
		super.operation();
		A();
		System.out.println("具体装饰对象A的操作");
		super.operation();
	}
	
	public void A(){
		System.out.println("A特有的方法");
	}
	

}
