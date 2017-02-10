package decorator;

/**
 * 具体装饰B类
 * 
 * @author user
 *
 */
public class ConcreteDecoratorB extends Decorator {
	public void operation() {
		super.operation();
		B();
		System.out.println("具体装饰对象B的操作");
		super.operation();
	}
	
	public void B(){
		System.out.println("B特有的方法");
	}

}
